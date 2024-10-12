import extension.DirectoryGeneratorExtension
import task.DirectoryFileGeneratorTask
import task.DirectoryGeneratorTask


class DirectoryGeneratorPlugin: Plugin<Project> {
    override fun apply(project: Project) {
        // register the extension
        val extension = project.extensions.create("directoryGenerator", DirectoryGeneratorExtension::class.java)

        // Register the task using the extension properties
        extension.directories

        project.tasks.register("generateDirectories", DirectoryGeneratorTask::class.java) {
            directories = extension.directories
        }

        project.tasks.register("generateDirectoriesFromFile", DirectoryFileGeneratorTask::class.java)

    }
}