/**
 * Precompiled [com.tooensure.io.gradle.kts][Com_tooensure_io_gradle] script plugin.
 *
 * @see Com_tooensure_io_gradle
 */
public
class Com_tooensure_ioPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Com_tooensure_io_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
