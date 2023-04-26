import GradleConst.APPLICATION_ID_PINK_DEV
import GradleConst.APPLICATION_ID_PINK_PREPROD
import GradleConst.APPLICATION_ID_PINK_RELEASE
import GradleConst.APPLICATION_ID_PINK_UAT
import GradleConst.APPLICATION_ID_BLUE_DEV
import GradleConst.APPLICATION_ID_BLUE_RELEASE
import GradleConst.APPLICATION_ID_BLUE_UAT
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
import GradleConst.PRODUCT_FLAVOR_PINK_DEV
import GradleConst.PRODUCT_FLAVOR_PINK_PD
import GradleConst.PRODUCT_FLAVOR_PINK_PREPROD
import GradleConst.PRODUCT_FLAVOR_PINK_RELEASE
import GradleConst.PRODUCT_FLAVOR_PINK_UAT
import GradleConst.PRODUCT_FLAVOR_BLUE_DEV
import GradleConst.PRODUCT_FLAVOR_BLUE_PD
import GradleConst.PRODUCT_FLAVOR_BLUE_PREPROD
import GradleConst.PRODUCT_FLAVOR_BLUE_RELEASE
import GradleConst.PRODUCT_FLAVOR_BLUE_UAT
import GradleConst.RELEASE_CONFIG_PINK
import GradleConst.RELEASE_CONFIG_BLUE
import GradleConst.STORE_PASSWORD
import Versions.Android.BUILD_TOOLS_VERSION


plugins {
    id(Plugins.Module.ANDROID_APPLICATION_PLUGIN)
    id(Plugins.Module.KOTLIN_ANDROID_PLUGIN)
    id(Plugins.Module.KOTLIN_KAPT_PLUGIN)
    id(Plugins.Module.NAV_SAFE_ARGS_PLUGIN)
    id(Plugins.Module.DAGGER_HILT_PLUGIN)
    id(Plugins.Module.GOOGLE_SERVICES_PLUGIN)
    id(Plugins.Module.KOTLIN_PARCELIZE)
    id(Plugins.Module.FIREBASE_CRASHLYTIC_PLUGIN)
    id(Plugins.Module.KTLINT_PLUGIN)
}

android {
    namespace = "com.freeman.color"
    compileSdk = Versions.Android.COMPILE_SDK_VERSION
    buildToolsVersion = BUILD_TOOLS_VERSION

    defaultConfig {
        minSdk = Versions.Android.MIN_SDK_VERSION
        targetSdk = Versions.Android.TARGET_SDK_VERSION
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
            isShrinkResources = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
        create(BUILD_TYPE_DEV) {
            isJniDebuggable = true
            isDebuggable = true
        }
        create(BUILD_TYPE_PD) {
            isDebuggable = true
            isJniDebuggable = true
        }
        create(BUILD_TYPE_UAT) {
            isJniDebuggable = true
            isDebuggable = true
        }
        create(BUILD_TYPE_PREPROD) {
            isJniDebuggable = true
            isDebuggable = true
        }
    }
    flavorDimensions.add("environment")
    productFlavors {
        val runTasks = gradle.startParameter.taskNames.toString().toLowerCase()
        println("asdfasdfa runTasks is $runTasks")
        create(LIFESTYLE) {
            when {
                runTasks.contains(PRODUCT_FLAVOR_BLUE_RELEASE) -> applicationId =
                    APPLICATION_ID_BLUE_RELEASE
                runTasks.contains(PRODUCT_FLAVOR_BLUE_DEV) -> applicationId =
                    APPLICATION_ID_BLUE_DEV
                runTasks.contains(PRODUCT_FLAVOR_BLUE_PD) -> applicationId =
                    APPLICATION_ID_BLUE_DEV //Project บน Firebase pd ไม่มีจริง ก็เรยเอา google-services ของ dev ไปใส่แทน
                runTasks.contains(PRODUCT_FLAVOR_BLUE_UAT) -> applicationId =
                    APPLICATION_ID_BLUE_UAT
                runTasks.contains(PRODUCT_FLAVOR_BLUE_PREPROD) -> applicationId =
                    APPLICATION_ID_BLUE_UAT //Project บน Firebase preprod ไม่มีจริง ก็เรยเอา google-services ของ uat ไปใส่แทน
            }
            versionCode = Versions.Android.BLUE_VERSION_CODE
            versionName = Versions.Android.BLUE_VERSION_NAME
            signingConfig =
                if (runTasks.contains(PRODUCT_FLAVOR_BLUE_RELEASE)) signingConfigs.getByName(
                    RELEASE_CONFIG_BLUE
                ) else signingConfigs.getByName(DEBUG_CONFIG)
        }
        create(BEAUTY) {
            when {
                runTasks.contains(PRODUCT_FLAVOR_PINK_RELEASE) -> applicationId =
                    APPLICATION_ID_PINK_RELEASE
                runTasks.contains(PRODUCT_FLAVOR_PINK_DEV) -> applicationId =
                    APPLICATION_ID_PINK_DEV
                runTasks.contains(PRODUCT_FLAVOR_PINK_PD) -> applicationId =
                    APPLICATION_ID_PINK_DEV //Project บน Firebase pd ไม่มีจริง ก็เรยเอา google-services ของ dev ไปใส่แทน
                runTasks.contains(PRODUCT_FLAVOR_PINK_UAT) -> applicationId =
                    APPLICATION_ID_PINK_UAT
                runTasks.contains(PRODUCT_FLAVOR_PINK_PREPROD) -> applicationId =
                    APPLICATION_ID_PINK_PREPROD
            }
            versionCode = Versions.Android.PINK_VERSION_CODE
            versionName = Versions.Android.PINK_VERSION_NAME
            signingConfig =
                if (runTasks.contains(PRODUCT_FLAVOR_PINK_RELEASE)) signingConfigs.getByName(
                    RELEASE_CONFIG_PINK
                ) else signingConfigs.getByName(DEBUG_CONFIG)
        }
    }
    kapt {
        correctErrorTypes = true
    }
    buildFeatures {
        viewBinding = true
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
//    setDynamicFeatures(
//        mutableSetOf(
//            MODULE_1,
//        )
//    )
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
//    dynamicFeatures += setOf(":Module1")
    configurations.all {
        resolutionStrategy {
            exclude("org.jetbrains.kotlinx", "kotlinx-coroutines-debug")
        }
    }
    ndkVersion = "21.3.6528147"
}

dependencies {
    api(project(Modules.BASE_LIBRARIES))
    implementation(Dependencies.EPOXY)
    kapt(Dependencies.EPOXY_ANNOTATION_PROCESSOR)
    implementation(Dependencies.ANDROID_SMS_VERIFICATION)
    implementation(Dependencies.FACEBOOK)
    implementation(Dependencies.LOTTIE)
    implementation(Dependencies.LOKALISE) {
        isTransitive = true
    }
    implementation(Dependencies.HILT_ANDROID)

    implementation(Dependencies.HILT_COMMON)
    implementation(Dependencies.ANDROIDX_APP_COMPAT)
    implementation(Dependencies.ANDROIDX_MATERIAL)
    implementation(Dependencies.ANDROIDX_CONSTRAINT_LAYOUT)
    implementation(Dependencies.SPLASH_SCREEN)
    implementation(Dependencies.PLAY_CORE)
    implementation(Dependencies.PLAY_CORE_EXTENSION)
    implementation(Dependencies.BROWSER)
    implementation(Dependencies.FIREBASE_REMOTE_CONFIG)
    implementation(Dependencies.FIREBASE_MESSAGING_SERVICE)
    implementation(Dependencies.PERMISSIONS_DISPATCHER)

    kapt(Dependencies.HILT_ANDROID_COMPILER)
    kapt(Dependencies.HILT_COMPILER)
    kapt(Dependencies.LIFECYCLE_COMMON_JAVA_8)
    kapt(Dependencies.KOTLINX_META_DATA)


    testImplementation(Dependencies.Test.BYTE_BUDDY_ANDROID)
    testImplementation(Dependencies.Test.BYTE_BUDDY_AGENT)
    testImplementation(Dependencies.Test.MOCKITO_CORE)
    testImplementation(Dependencies.Test.MOCKITO_INLINE)
    testImplementation(Dependencies.Test.MOCKK)
    testImplementation(Dependencies.Test.MOCKK_ANDROID) {
        exclude("io.mockk", "mockk-agent-jvm")
    }
    testImplementation(Dependencies.Test.JUNIT)
    testImplementation(Dependencies.Test.GOOGLE_TRUTH)
    testImplementation(Dependencies.Test.COROUTINES_TEST)
    testImplementation(Dependencies.Test.CORE_TESTING)
    testImplementation(Dependencies.Test.TEST_RULE)
    testImplementation(Dependencies.Test.TEST_RUNNER)
    testImplementation(Dependencies.Test.ANDROIDX_ESPRESSO)
    testImplementation(Dependencies.Test.ANDROIDX_JUNIT)
    testImplementation(Dependencies.LOKALISE) {
        isTransitive = true
    }
    testImplementation(Dependencies.Test.TESTING_HILT_ANDROID_TESTING) {
        exclude("org.jetbrains.kotlinx", "kotlinx-coroutines-debug")
    }
    kaptTest(Dependencies.Test.TESTING_HILT_ANDROID_COMPILER) {
        exclude("org.jetbrains.kotlinx", "kotlinx-coroutines-debug")
    }
}

gradle.buildFinished {
    try {
        val file = File("app/src/main/assets/soundEnable.json")
        val json = groovy.json.JsonSlurper().parseText(file.readText()) as Map<*, *>
        if (json["isSoundWhenBuildFinished"] as Boolean) {
            playSound(this.failure?.message == null)
        }
    } catch (ignore: Throwable) {
        println("=======")
        println(ignore.cause)
        println(ignore.stackTrace)
        println("=======")
    }
}

fun playSound(success: Boolean) {
    if (success) {
        Runtime.getRuntime()
            .exec("afplay app/src/main/assets/sound/you-got-it.wav")
    } else {
        Runtime.getRuntime()
            .exec("afplay app/src/main/assets/sound/shes_a_crazy_psycho.wav")
    }
}

kotlinter {
    disabledRules = arrayOf("no-wildcard-imports", "import-ordering")
}


