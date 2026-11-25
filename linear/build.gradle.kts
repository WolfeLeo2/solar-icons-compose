plugins {
    id("solar.module")
}

description = "Linear style icons for Solar Icons in Compose Multiplatform"

kotlin {
    sourceSets.commonMain.dependencies {
        api(project(":core"))
    }
}
