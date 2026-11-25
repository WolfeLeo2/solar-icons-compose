// Kotlin Multiplatform library setup shared by core, every style module and the umbrella.
plugins {
    id("org.jetbrains.kotlin.multiplatform")
    id("com.android.kotlin.multiplatform.library")
    id("org.jetbrains.kotlin.plugin.compose")
    id("solar.publish")
}

val catalog = the<VersionCatalogsExtension>().named("libs")
fun version(alias: String) = catalog.findVersion(alias).get().requiredVersion

kotlin {
    explicitApi()
    android {
        namespace = "io.github.wolfeleo2.solaricons." + project.name.replace("-", "")
        compileSdk = version("android-compileSdk").toInt()
        minSdk = version("android-minSdk").toInt()
    }
    jvm("desktop")
    iosArm64()
    iosSimulatorArm64()
    js { browser() }
    @OptIn(org.jetbrains.kotlin.gradle.ExperimentalWasmDsl::class)
    wasmJs { browser() }
}
