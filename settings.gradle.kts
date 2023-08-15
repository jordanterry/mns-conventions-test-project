pluginManagement {
    repositories {
        val localProperties = file("local.properties")
        val properties = if (localProperties.exists()) {
            java.util.Properties().apply {
                java.io.InputStreamReader(localProperties.inputStream(), Charsets.UTF_8).use { reader ->
                    load(reader)
                }
            }
        } else {
            null
        }

        val packagesAccount = properties?.getProperty("gpr.user")
            ?: System.getenv("GITHUB_PACKAGES_ACCOUNT")
        val packagesToken = properties?.getProperty("gpr.token")
            ?: System.getenv("GITHUB_PACKAGES_TOKEN")
        google()
        mavenCentral()
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
        maven {
            url = uri("https://maven.pkg.github.com/DigitalInnovation/mns-conventions-plugin")
            credentials {
                username = packagesAccount
                password = packagesToken
            }
        }
    }
}
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "conventions-test"
include(":app")
include(":feature:api")
include(":feature:di")
include(":feature:impl")
