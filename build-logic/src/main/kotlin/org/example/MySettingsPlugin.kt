package org.example

import org.gradle.api.Plugin
import org.gradle.api.initialization.Settings
import org.gradle.api.plugins.ExtraPropertiesExtension
import org.gradle.api.provider.Property

class MySettingsPlugin : Plugin<Settings> {
    override fun apply(settings: Settings) {
        val mySettings = settings.extensions.create("mySettings", MySettingsExtension::class.java)
        settings.gradle.beforeProject { project ->
            project.extensions.getByType(ExtraPropertiesExtension::class.java).set("foo", mySettings)
        }
    }
}

abstract class MySettingsExtension {
    abstract val myString: Property<String>
    abstract val myInt: Property<Int>
}