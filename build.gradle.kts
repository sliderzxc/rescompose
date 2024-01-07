import com.sliderzxc.gradle.android.config.AndroidConfig
import com.sliderzxc.gradle.defaults.setupDefaults
import com.sliderzxc.gradle.multiplatform.config.MultiplatformConfig
import com.sliderzxc.gradle.multiplatform.platforms.Platform

plugins {
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    id("com.sliderzxc.gradle.setup")
}

setupDefaults(
    multiplatformConfig = MultiplatformConfig(
        platforms = setOf(Platform.Android, Platform.Jvm, Platform.Js)
    ),
    androidConfig = AndroidConfig(
        minSdkVersion = 21,
        compileSdkVersion = 34,
        targetSdkVersion = 34,
        namespace = "com.sliderzxc.rescompose"
    )
)