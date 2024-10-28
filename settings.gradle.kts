pluginManagement {
    includeBuild("build-logic")
}

plugins {
    id("mySettingsPlugin")
}

includeBuild("build-logic")
include("library1")
include("library2")

mySettings {
    myString.set("amazing")
    myInt.set(42)
}