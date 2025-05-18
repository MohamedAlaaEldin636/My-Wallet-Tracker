plugins {
	alias(libs.plugins.android.library)
	alias(libs.plugins.kotlin.android)
}

android {
	namespace = "my.ym.data_transactions"
	compileSdk = 35

	defaultConfig {
		minSdk = 24

		testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
		consumerProguardFiles("consumer-rules.pro")
	}

	buildTypes {
		release {
			isMinifyEnabled = false
			proguardFiles(
				getDefaultProguardFile("proguard-android-optimize.txt"),
				"proguard-rules.pro"
			)
		}
	}
	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_11
		targetCompatibility = JavaVersion.VERSION_11
	}
	kotlinOptions {
		jvmTarget = "11"
	}
}

dependencies {

	// Local Modules
	implementation(projects.data)

	// Androidx Core
	implementation(libs.androidx.core.ktx)

	// Androidx Compose
	implementation(platform(libs.androidx.compose.bom))
	implementation(libs.androidx.compose.material3)

	// ---- Testing ---- //

	// junit
	testImplementation(libs.junit)

	// Androidx Test
	androidTestImplementation(libs.androidx.test.junit)
	androidTestImplementation(libs.androidx.test.espresso.core)

}