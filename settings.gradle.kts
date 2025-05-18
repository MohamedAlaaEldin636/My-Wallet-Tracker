pluginManagement {
	repositories {
		google {
			content {
				includeGroupByRegex("com\\.android.*")
				includeGroupByRegex("com\\.google.*")
				includeGroupByRegex("androidx.*")
			}
		}
		mavenCentral()
		gradlePluginPortal()
	}
}

dependencyResolutionManagement {
	repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

	repositories {
		google()
		mavenCentral()
	}
}

// Used to be able to use local module via projects.* in gradle inshallah
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "MyWalletTracker"

include(":core")
include(":core:ui")

include(":data")
include(":data:transactions")

include(":domain")
include(":domain:transactions")

include(":ui")
include(":ui:transactions")

include(":app")
