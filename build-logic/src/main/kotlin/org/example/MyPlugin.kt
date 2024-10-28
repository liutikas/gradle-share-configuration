package org.example

import org.gradle.api.GradleException
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.ExtraPropertiesExtension

class MyPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val mySettings = project.extensions.getByType(ExtraPropertiesExtension::class.java).get("foo").let {
            if (it !is MySettingsExtension) throw GradleException("Settings extension type mismatch")
            it
        }
        println("""
            myString = ${mySettings.myString.get()}
            myInt = ${mySettings.myInt.get()}
        """.trimIndent())
    }
}
