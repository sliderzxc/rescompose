pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven("https://jitpack.io")
    }

    resolutionStrategy {
        eachPlugin {
            if (requested.id.toString() == "com.sliderzxc.gradle.setup") {
                val version = "1.3.0"
                useModule("com.github.sliderzxc:gradle-setup-plugin:$version")
            }
        }
    }

    plugins {
        id("com.sliderzxc.gradle.setup")
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "rescompose"

include(":core")