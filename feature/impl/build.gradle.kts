plugins {
    alias(libs.plugins.mns.android.library)
}

android {
    namespace = "com.mns.feature.impl"
}

dependencies {
    testImplementation(libs.bundles.junit.jupiter)
    testRuntimeOnly(libs.junit.jupiter.runtime)
}