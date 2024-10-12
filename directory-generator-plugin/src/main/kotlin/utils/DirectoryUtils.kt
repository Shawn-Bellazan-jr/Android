package utils

import org.gradle.api.Project
import java.nio.file.Path
import java.nio.file.Paths
import kotlin.io.path.createDirectories
import kotlin.io.path.exists

object DirectoryUtils {
    fun createDirectory(project: Project, directory: String, onResult: (Boolean) -> Unit) {
        val directoryPath: Path = Paths.get(project.projectDir.absolutePath, directory)
        if (!directoryPath.exists()) {
            directoryPath.createDirectories()
            println("Created directory: $directoryPath")
            onResult(true) // Indicating success
        } else {
            println("Directory already exists: $directoryPath")
            onResult(false) // Indicating the directory already exists
        }
    }
}