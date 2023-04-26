// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Plugins.Project.CLASSPATH_GRADLE)
        classpath(kotlin("gradle-plugin", version = Versions.KOTLIN_VERSION))
        classpath(Plugins.Project.CLASSPATH_NAVIGATION_ARGS)
        classpath(Plugins.Project.CLASSPATH_HILT)
        classpath(Plugins.Project.CLASSPATH_GOOGLE_SERVICES)
        classpath(Plugins.Project.CLASSPATH_CRASHLYTICS)
        classpath(Plugins.Project.CLASSPATH_PAPARAZZI)
    }
}

plugins {
    id(Plugins.Module.KTLINT_PLUGIN) version Versions.KTLINT_VERSION
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven {
            setUrl("https://maven.lokalise.com")
        }
        maven {
            setUrl("https://jitpack.io")
        }
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

//task("check").dependsOn("installKotlinterPrePushHook")