import com.android.build.gradle.LibraryExtension
import config.configureAndroid
import config.configureCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import utils.libs

class LibraryFeatureConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.library")
                apply("org.jetbrains.kotlin.android")
            }

            extensions.configure<LibraryExtension> {
                configureAndroid(this)
                configureCompose(this)
            }

            dependencies {
                add(
                    "implementation",
                    libs.findLibrary("androidx-lifecycle-viewmodel-compose").get()
                )
            }
        }
    }
}

