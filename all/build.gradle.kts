
plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.vanniktech.publish)
}

kotlin {
    androidTarget {
        publishLibraryVariants("release")
    }
    jvm("desktop")
    iosArm64()
    iosSimulatorArm64()
    js { browser() }
    @OptIn(org.jetbrains.kotlin.gradle.ExperimentalWasmDsl::class)
    wasmJs { browser() }

    sourceSets {
        commonMain.dependencies {
            api(project(":core"))
            api(project(":bold"))
            api(project(":bold-duotone"))
            api(project(":linear"))
            api(project(":line-duotone"))
            api(project(":broken"))
            api(project(":outline"))
            implementation(compose.runtime)
        }
    }
}

android {
    namespace = "com.wolfeleo2.solaricons.all"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
}

mavenPublishing {
    publishToMavenCentral()
    signAllPublications()
    coordinates(artifactId = "solar-icons-all")
    pom {
        name.set("Solar Icons All")
        description.set("Umbrella artifact including all 6 styles of Solar Icons for Compose Multiplatform")
        url.set("https://github.com/wolfeleo2/solar-icons-compose")
        inceptionYear.set("2026")
        licenses {
            license {
                name.set("MIT")
                url.set("https://opensource.org/licenses/MIT")
            }
        }
        developers {
            developer {
                id.set("wolfeleo2")
                name.set("Leo Wolfe")
            }
        }
        scm {
            url.set("https://github.com/wolfeleo2/solar-icons-compose")
            connection.set("scm:git:git://github.com/wolfeleo2/solar-icons-compose.git")
            developerConnection.set("scm:git:ssh://git@github.com/wolfeleo2/solar-icons-compose.git")
        }
    }
}
