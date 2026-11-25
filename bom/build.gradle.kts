plugins {
    `java-platform`
    id("solar.publish")
}

description = "Bill of Materials (BOM) to align all Solar Icons Compose dependencies"

dependencies {
    constraints {
        rootProject.subprojects.filter { it != project }.forEach { api(it) }
    }
}
