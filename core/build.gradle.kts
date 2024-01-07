import com.sliderzxc.gradle.multiplatform.bundle.bundle
import com.sliderzxc.gradle.multiplatform.setupMultiplatform
import com.sliderzxc.gradle.publishing.setupPublishing
import com.sliderzxc.gradle.multiplatform.setupSourceSets

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    id("com.sliderzxc.gradle.setup")
}

setupMultiplatform()

kotlin {
    setupSourceSets {
        val android by bundle()
        val jvm by bundle()
        val js by bundle()
        val common by bundle()
    }
}