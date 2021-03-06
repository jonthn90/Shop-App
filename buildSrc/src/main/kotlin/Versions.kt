import kotlin.String
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

/**
 * Generated by https://github.com/jmfayard/buildSrcVersions
 *
 * Find which updates are available by running
 *     `$ ./gradlew buildSrcVersions`
 * This will only update the comments.
 *
 * YOU are responsible for updating manually the dependency version.
 */
object Versions {
    const val org_jetbrains_kotlinx_kotlinx_coroutines: String = "1.3.5"
    // available: "1.3.5-1.4-M1-release-99"

    const val com_squareup_retrofit2: String = "2.8.1"

    const val androidx_databinding: String = "3.6.2"

    const val org_jetbrains_kotlin: String = "1.3.71"

    const val androidx_navigation: String = "2.3.0-alpha04"

    const val androidx_lifecycle: String = "2.2.0"

    const val androidx_room: String = "2.2.5"

    const val org_koin: String = "2.1.5"

    const val com_android_tools_build_gradle: String = "3.6.2" // available: "3.6.2"

    const val androidx_test_ext_junit: String = "1.1.1"

    const val junit_junit: String = "4.13"

    const val de_fayard_buildsrcversions_gradle_plugin: String = "0.7.0"

    const val firebase_crashlytics_gradle: String = "2.0.0-beta03"

    const val firebase_firestore_ktx: String = "21.4.2" // available: "21.4.2"

    const val firebase_functions_ktx: String = "19.0.2"

    const val firebase_crashlytics: String = "17.0.0-beta02"

    const val firebase_storage_ktx: String = "19.1.1"

    const val androidnetworktools: String = "0.4.5.2"

    const val logging_interceptor: String = "4.4.1" // available: "4.5.0"

    const val firebase_analytics: String = "17.2.3" // available: "17.3.0"

    const val firebase_messaging: String = "20.1.3" // available: "20.1.5"

    const val paging_runtime_ktx: String = "2.1.2"

    const val swiperefreshlayout: String = "1.0.0"

    const val legacy_support_v4: String = "1.0.0"

    const val constraintlayout: String = "1.1.3"

    const val google_services: String = "4.3.3"

    const val espresso_core: String = "3.2.0"

    const val firebase_auth: String = "19.3.0"

    const val recyclerview: String = "1.1.0"

    const val lint_gradle: String = "26.6.1" // available: "26.6.2"

    const val appcompat: String = "1.1.0"

    const val core_ktx: String = "1.2.0"

    const val material: String = "1.2.0-alpha05"

    const val fresco: String = "2.2.0"

    const val lottie: String = "3.4.0"

    const val timber: String = "4.7.1"

    const val aapt2: String = "3.6.1-6040484" // available: "3.6.2-6040484"

    /**
     * Current version: "5.6.4"
     * See issue 19: How to update Gradle itself?
     * https://github.com/jmfayard/buildSrcVersions/issues/19
     */
    const val gradleLatestVersion: String = "6.3"
}

/**
 * See issue #47: how to update buildSrcVersions itself
 * https://github.com/jmfayard/buildSrcVersions/issues/47
 */
val PluginDependenciesSpec.buildSrcVersions: PluginDependencySpec
    inline get() =
        id("de.fayard.buildSrcVersions").version(Versions.de_fayard_buildsrcversions_gradle_plugin)
