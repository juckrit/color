object Plugins {
    object Project {
        const val CLASSPATH_GRADLE = "com.android.tools.build:gradle:${Versions.ANDROID_GRADLE_VERSION}"
        const val CLASSPATH_NAVIGATION_ARGS = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.ANDROID_NAVIGATION_VERSION}"
        const val CLASSPATH_HILT = "com.google.dagger:hilt-android-gradle-plugin:${Versions.ANDROID_HILT_VERSION}"
        const val CLASSPATH_GOOGLE_SERVICES = "com.google.gms:google-services:${Versions.GOOGLE_SERVICES_PLUGIN}"
        const val CLASSPATH_CRASHLYTICS = "com.google.firebase:firebase-crashlytics-gradle:${Versions.FIREBASE_CRASHLYTICS_GRADLE}"
        const val CLASSPATH_PAPARAZZI = "app.cash.paparazzi:paparazzi-gradle-plugin:${Versions.PAPARAZZI_VERSION}"
    }
    object Module {
        //base plugin
        const val ANDROID_APPLICATION_PLUGIN = "com.android.application"
        const val ANDROID_LIBRARY_PLUGIN = "com.android.library"
        const val ANDROID_DYNAMIC_FEATURE_PLUGIN = "com.android.dynamic-feature"
        const val KOTLIN_ANDROID_PLUGIN = "kotlin-android"
        const val KOTLIN_PARCELIZE = "kotlin-parcelize"
        const val KOTLIN_KAPT_PLUGIN = "kotlin-kapt"
        const val KTLINT_PLUGIN = "org.jmailen.kotlinter"
        //library plugin
        const val DAGGER_HILT_PLUGIN = "dagger.hilt.android.plugin"
        const val NAV_SAFE_ARGS_PLUGIN = "androidx.navigation.safeargs.kotlin"
        const val APOLLO_PLUGIN = "com.apollographql.apollo3"
        const val GOOGLE_SERVICES_PLUGIN = "com.google.gms.google-services"
        const val FIREBASE_CRASHLYTIC_PLUGIN = "com.google.firebase.crashlytics"
        //SnapShot plugin
        const val PAPARAZZI = "app.cash.paparazzi"
    }
}