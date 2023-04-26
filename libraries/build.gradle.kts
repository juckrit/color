import GradleConst.BEAUTY
import GradleConst.BUILD_TYPE_DEBUG
import GradleConst.BUILD_TYPE_DEV
import GradleConst.BUILD_TYPE_PD
import GradleConst.BUILD_TYPE_PREPROD
import GradleConst.BUILD_TYPE_RELEASE
import GradleConst.BUILD_TYPE_UAT
import GradleConst.DEBUG_CONFIG
import GradleConst.DEBUG_KEY_ALIAS
import GradleConst.DEBUG_KEY_PASSWORD
import GradleConst.DEBUG_KEY_STORE_PATH
import GradleConst.DEBUG_STORE_PASSWORD
import GradleConst.KEY_PASSWORD
import GradleConst.LIFESTYLE
import GradleConst.RELEASE_CONFIG_BLUE
import GradleConst.RELEASE_CONFIG_PINK
import GradleConst.STORE_PASSWORD

plugins {
    id(Plugins.Module.ANDROID_LIBRARY_PLUGIN)
    id(Plugins.Module.KOTLIN_ANDROID_PLUGIN)
    id(Plugins.Module.KOTLIN_PARCELIZE)
    id(Plugins.Module.KOTLIN_KAPT_PLUGIN)
    id(Plugins.Module.DAGGER_HILT_PLUGIN)
//    id(Plugins.Module.APOLLO_PLUGIN).version(Versions.APOLLO_CLIENT)
    id(Plugins.Module.KTLINT_PLUGIN)
}

android {
    namespace = "com.example.libraries"
    compileSdk = Versions.Android.COMPILE_SDK_VERSION

    defaultConfig {
        minSdk = Versions.Android.MIN_SDK_VERSION
        targetSdk = Versions.Android.TARGET_SDK_VERSION
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    signingConfigs {
        create(RELEASE_CONFIG_BLUE) {
            storeFile = file(DEBUG_KEY_STORE_PATH)
            storePassword = STORE_PASSWORD
            keyAlias = GradleConst.android
            keyPassword = KEY_PASSWORD
        }
        create(RELEASE_CONFIG_PINK) {
            storeFile = file(DEBUG_KEY_STORE_PATH)
            storePassword = STORE_PASSWORD
            keyAlias = BEAUTY
            keyPassword = KEY_PASSWORD
        }
        create(DEBUG_CONFIG) {
            storeFile = file(DEBUG_KEY_STORE_PATH)
            storePassword = DEBUG_STORE_PASSWORD
            keyAlias = DEBUG_KEY_ALIAS
            keyPassword = DEBUG_KEY_PASSWORD
        }
    }

    variantFilter {
        if (buildType.name == BUILD_TYPE_DEBUG) {
            ignore = true
        }
    }

    buildTypes {
        getByName(BUILD_TYPE_RELEASE) {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
        create(BUILD_TYPE_DEV) {
        }
        create(BUILD_TYPE_PD) {
        }
        create(BUILD_TYPE_UAT) {
        }
        create(BUILD_TYPE_PREPROD) {
        }
    }

    flavorDimensions.add("environment")
    productFlavors {
        create(LIFESTYLE) {
        }
        create(BEAUTY) {
        }
    }

    buildFeatures {
        viewBinding = true
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.0"
    }

    packagingOptions {
        this.resources.excludes.add("META-INF/gradle/incremental.annotation.processors")
        this.resources.excludes.add("META-INF/*.kotlin_module")
        this.resources.excludes.add("META-INF/DEPENDENCIES")
        this.resources.excludes.add("META-INF/LICENSE")
        this.resources.excludes.add("META-INF/LICENSE.txt")
        this.resources.excludes.add("META-INF/license.txt")
        this.resources.excludes.add("META-INF/NOTICE")
        this.resources.excludes.add("META-INF/NOTICE.txt")
        this.resources.excludes.add("META-INF/notice.txt")
        this.resources.excludes.add("META-INF/ASL2.0")
        this.resources.excludes.add("META-INF/gradle/incremental.annotation.processors")
    }
    configurations.all {
        resolutionStrategy {
            exclude("org.jetbrains.kotlinx", "kotlinx-coroutines-debug")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    api(Dependencies.RETROFIT)
    api(Dependencies.RETROFIT_MOSHI_CONVERNTER)
    api(Dependencies.RETROFIT_GSON_CONVERTER)
    api(Dependencies.MOSHI)
    api(Dependencies.MOSHICODEGEN)
    api(Dependencies.RXJAVA_ADAPTER)
    api(Dependencies.KOTLIN_REFLECT)
    api(Dependencies.TIMBER)
    api(Dependencies.ANDROIDX_LIVE_DATA)
    api(Dependencies.ANDROIDX_VIEW_MODEL)
    api(Dependencies.ANDROIDX_LIFE_CYCLE)
    api(Dependencies.ANDROIDX_NAVIGATION_UI)
    api(Dependencies.ANDROIDX_NAVIGATION_UI_KTX)
    api(Dependencies.ANDROIDX_APP_COMPAT)
    api(Dependencies.ANDROIDX_CONSTRAINT_LAYOUT)
    api(Dependencies.ANDROIDX_CORE_KTX)
    api(Dependencies.ANDROIDX_MATERIAL)
    api(Dependencies.ANDROIDX_NAVIGATION_FRAGMENT)
    api(Dependencies.ANDROIDX_NAVIGATION_FRAGMENT_KTX)
    api(Dependencies.ANDROIDX_NAVIGATION_DYNAMIC_FEATURE)
    api(Dependencies.COROUTINE_CORE)
    api(Dependencies.COROUTINE_ANDROID)
    api(Dependencies.APOLLO_RUNTIME)
    api(Dependencies.APOLLO_API)
    api(Dependencies.ANDROIDX_FRAGMENT_TEST)
    api(Dependencies.GSON)
    api(Dependencies.DETECT_SOFT_KEYBOARD)
    api(Dependencies.EPOXY)
    api(Dependencies.FACEBOOK_SDK)
    api(Dependencies.FIREBASE_BOM)
    api(Dependencies.FIREBASE_ANALYTICS)
    api(Dependencies.FIREBASE_CORE)
    api(Dependencies.SNOWPLOW)
    api(Dependencies.OMISE)
    api(Dependencies.LOGGING_INTERCEPTOR)
    api(Dependencies.GLIDE)
    api(Dependencies.FLEXBOX)
    api(Dependencies.SWIPE_LAYOUT)
    api(Dependencies.PALATTE)
    api(Dependencies.HILT_ANDROID)
    api(Dependencies.HILT_COMMON)
    api(Dependencies.PAGING)
    api(Dependencies.EPOXY_PAGING)
    api(Dependencies.PLAY_CORE)
    api(Dependencies.PLAY_CORE_EXTENSION)
    api(Dependencies.ADJUST_ANALYTIC)
    api(Dependencies.INSTALL_REFERRER)
    api(Dependencies.GOOGLE_PLAY_SERVICES_ADS_IDENTIFIER)
    api(Dependencies.FIREBASE_CRASHLYTIC)
    api(Dependencies.ONE_TRUST)
    api(Dependencies.QR_GENERATOR)
    api(Dependencies.ANDROIDX_SECURITY)
    api(Dependencies.EXPANDABLE_LAYOUT)
    api(Dependencies.RECYCLERVIEW)
    loadCompose(this)
    loadComposeToolkitDependencies(this)
    loadViewThemeInCompose(this)
    api("io.coil-kt:coil-compose:2.2.2")
    api("com.google.android.material:material:1.8.0")

    testImplementation(Dependencies.Test.BYTE_BUDDY_ANDROID)
    testImplementation(Dependencies.Test.BYTE_BUDDY_AGENT)
    testImplementation(Dependencies.Test.MOCKITO_CORE)
    testImplementation(Dependencies.Test.MOCKITO_INLINE)
    testImplementation(Dependencies.Test.MOCKK)
    testImplementation(Dependencies.Test.MOCKK_ANDROID) {
        exclude("io.mockk", "mockk-agent-jvm")
    }

    kapt(Dependencies.HILT_ANDROID_COMPILER)
    kapt(Dependencies.HILT_COMPILER)
    kapt(Dependencies.KOTLINX_META_DATA)


    testImplementation(Dependencies.Test.JUNIT)
    testImplementation(Dependencies.Test.GOOGLE_TRUTH)
    testImplementation(Dependencies.Test.COROUTINES_TEST)
    testImplementation(Dependencies.Test.CORE_TESTING)
    testImplementation(Dependencies.Test.TEST_RULE)
    testImplementation(Dependencies.Test.TEST_RUNNER)
    testImplementation(Dependencies.Test.ROBOLECTRIC)
    testImplementation(Dependencies.Test.TESTING_HILT_ANDROID_TESTING) {
        exclude("org.jetbrains.kotlinx", "kotlinx-coroutines-debug")
    }
    testImplementation(Dependencies.LOKALISE) {
        isTransitive = true
    }
    kaptTest(Dependencies.Test.TESTING_HILT_ANDROID_COMPILER) {
        exclude("org.jetbrains.kotlinx", "kotlinx-coroutines-debug")
    }

    androidTestImplementation(Dependencies.Test.ANDROIDX_ESPRESSO)
    androidTestImplementation(Dependencies.Test.ANDROIDX_JUNIT)
    androidTestImplementation(Dependencies.Test.JUNIT)
    androidTestImplementation(Dependencies.Test.GOOGLE_TRUTH)
    androidTestImplementation(Dependencies.Test.COROUTINES_TEST)
    androidTestImplementation(Dependencies.Test.CORE_TESTING)
    androidTestImplementation(Dependencies.Test.TEST_RULE)
    androidTestImplementation(Dependencies.Test.TEST_RUNNER)
    androidTestImplementation(Dependencies.LOKALISE) {
        isTransitive = true
    }
    androidTestImplementation(Dependencies.Test.TESTING_HILT_ANDROID_TESTING) {
        exclude("org.jetbrains.kotlinx", "kotlinx-coroutines-debug")
    }
    kaptAndroidTest(Dependencies.Test.TESTING_HILT_ANDROID_COMPILER) {
        exclude("org.jetbrains.kotlinx", "kotlinx-coroutines-debug")
    }
}

fun loadCompose(dependencyHandlerScope: DependencyHandlerScope) {
    dependencyHandlerScope {
        api(Dependencies.Compose.COMPOSE_UI)
        // Tooling support (Previews, etc.)
        api(Dependencies.Compose.COMPOSE_UI_TOOLING)
        // Foundation (Border, Background, Box, Image, Scroll, shapes, animations, etc.)
        api(Dependencies.Compose.COMPOSE_FOUNDATION)
        // Material Design
        api(Dependencies.Compose.COMPOSE_MATERIAL)
        // Material design icons
        api(Dependencies.Compose.COMPOSE_MATERIAL_ICON_CORE)
        api(Dependencies.Compose.COMPOSE_MATERIAL_ICON_EXTENDED)
        // Integration with observables
        api(Dependencies.Compose.COMPOSE_RUNTIME_LIVE_DATA)
        api(Dependencies.Compose.COMPOSE_RUNTIME_RXJAVA2)

        // UI Tests
        androidTestApi(Dependencies.Compose.COMPOSE_UI_TEST_JUNIT)
    }
}

fun loadComposeToolkitDependencies(dependencyHandlerScope: DependencyHandlerScope) {
    dependencyHandlerScope {
        // Integration with activities
        api(Dependencies.ACTIVITY_COMPOSE)
        // Animations
        api(Dependencies.Compose.COMPOSE_ANIMATION)
        // Integration with ViewModels
        api(Dependencies.ANDROIDX_VIEW_MODEL_COMPOSE)
    }
}

fun loadViewThemeInCompose(dependencyHandlerScope: DependencyHandlerScope) {
    dependencyHandlerScope {
        // When using a MDC theme
        api(Dependencies.ANDROID_MATERIAL_COMPOSE_THEME_ADAPTER)
        // When using a AppCompat theme
        api(Dependencies.ACCOMPANIST_THEME)
    }
}
