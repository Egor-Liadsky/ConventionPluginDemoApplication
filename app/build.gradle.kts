plugins {
    id("demoApplication.application")
}

android {
    namespace = "com.lyadsky.multimodularityapplicationdemo1"

    defaultConfig {
        applicationId = "com.lyadsky.multimodularityapplicationdemo1"
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
}

dependencies {
    implementation(projects.data)
    implementation(projects.feature.home)
    implementation(projects.feature.search)
    implementation(projects.feature.settings)

    implementation(libs.koin.compose)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.ui)
    implementation(libs.androidx.activity.compose)
}

