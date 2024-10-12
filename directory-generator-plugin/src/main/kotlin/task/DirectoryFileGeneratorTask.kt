package task

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import utils.DirectoryUtils

class DirectoryFileGeneratorTask: DefaultTask() {
    @TaskAction
    fun generateDirectoriesFromFile() {
        val dirFilePath = project.projectDir.resolve("directories.dir") // Specify your directory file name
        if (!dirFilePath.exists()) {
            throw IllegalArgumentException("Directory file '$dirFilePath' not found.")
        }

        // Read the file and create directories
        val lines = dirFilePath.readText().lines().filter { it.isNotBlank() }
        if (lines.isEmpty()) {
            throw IllegalArgumentException("No directories specified in the file '$dirFilePath'.")
        }

        lines.forEach { dir ->
            DirectoryUtils.createDirectory(project, dir) { success ->
                if (success) {
                    println("Successfully created or verified directory: $dir")
                } else {
                    println("Directory already exists: $dir")
                }
            }
        }
    }
}


