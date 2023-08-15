plugins {
    alias(libs.plugins.mns.android.application)
    alias(libs.plugins.gmazzo.test.aggregation)
    alias(libs.plugins.gmazzo.coverage.aggregation)
    id("jvm-test-suite")
}

android {
    namespace = "com.example.conventions_test"

    defaultConfig {
        applicationId = "com.example.conventions_test"
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    testImplementation(libs.bundles.junit.jupiter)
    testRuntimeOnly(libs.junit.jupiter.runtime)
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}