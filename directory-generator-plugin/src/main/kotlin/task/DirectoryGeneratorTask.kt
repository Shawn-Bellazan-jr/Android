package task

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.TaskAction
import utils.DirectoryUtils
import java.nio.file.Files.createDirectory

class DirectoryGeneratorTask: DefaultTask() {
    @get:Input
    @get:Optional
    var directories: List<String> = emptyList()

    @TaskAction
    fun generateDirectories() {
        if (directories.isEmpty()) {
            throw IllegalArgumentException("No directories specified for generation.")
        } else {
            directories.forEach { dir ->
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

//    private fun createDirectory(dir: String) {
//        val directoryPath: Path = Paths.get(project.projectDir.absolutePath, dir)
//
//        // create directories using kotlin-io
//        if (!directoryPath.exists()) {
//            directoryPath.createDirectories()
//            println("Created directory: $directoryPath")
//        } else {
//            println("Directory already exists: $directoryPath")
//        }
//    }
}