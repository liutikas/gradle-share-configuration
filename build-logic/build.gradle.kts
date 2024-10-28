plugins {
    alias(libs.plugins.jvm)
    id("java-gradle-plugin")
}

repositories {
    mavenCentral()
}

gradlePlugin {
    plugins {
        create("myPlugin") {
            id = "myPlugin"
            implementationClass = "org.example.MyPlugin"
        }
        create("mySettingsPlugin") {
            id = "mySettingsPlugin"
            implementationClass = "org.example.MySettingsPlugin"
        }
    }
}
