object Dependencies {
    //Base
    const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.KOTLIN_VERSION}"
    const val KOTLIN_REFLECT = "org.jetbrains.kotlin:kotlin-reflect:${Versions.KOTLIN_VERSION}"
    const val ANDROIDX_APP_COMPAT = "androidx.appcompat:appcompat:${Versions.ANDROID_APPCOMPAT_VERSION}"
    const val ANDROIDX_LIVE_DATA = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.ANDROID_LIFECYCLE_VERSION}"
    const val ANDROIDX_VIEW_MODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.ANDROID_LIFECYCLE_VERSION}"
    const val ANDROIDX_VIEW_MODEL_COMPOSE = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.ANDROID_LIFECYCLE_VERSION}"
    const val ANDROIDX_LIFE_CYCLE = "androidx.lifecycle:lifecycle-common-java8:${Versions.ANDROID_LIFECYCLE_VERSION}"
    const val ANDROIDX_ACTIVITY = "androidx.activity:activity-ktx:${Versions.ANDROIDX_ACTIVITY_VERSION}"
    const val ACTIVITY_COMPOSE = "androidx.activity:activity-compose:${Versions.ANDROIDX_ACTIVITY_VERSION}"
    const val ANDROIDX_FRAGMENT = "androidx.fragment:fragment-ktx:${Versions.ANDROID_FRAGMENT}"
    const val ANDROIDX_CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${Versions.ANDROID_CONSTRAINTLAYOUT_VERSION}"
    const val ANDROIDX_CORE_KTX = "androidx.core:core-ktx:${Versions.ANDROID_CORE_KTX_VERSION}"
    const val ANDROIDX_MATERIAL = "com.google.android.material:material:${Versions.ANDROID_MATERIAL_VERSION}"
    const val ANDROIDX_FRAGMENT_TEST = "androidx.fragment:fragment-testing:${Versions.ANDROID_FRAGMENT}"
    const val ANDROIDX_SECURITY = "androidx.security:security-crypto:${Versions.ANDROIDX_SECURITY_VERSION}"

    //Navigation Component
    const val ANDROIDX_NAVIGATION_UI = "androidx.navigation:navigation-ui:${Versions.ANDROID_NAVIGATION_VERSION}"
    const val ANDROIDX_NAVIGATION_UI_KTX = "androidx.navigation:navigation-ui-ktx:${Versions.ANDROID_NAVIGATION_VERSION}"
    const val ANDROIDX_NAVIGATION_FRAGMENT = "androidx.navigation:navigation-fragment:${Versions.ANDROID_NAVIGATION_VERSION}"
    const val ANDROIDX_NAVIGATION_FRAGMENT_KTX = "androidx.navigation:navigation-fragment-ktx:${Versions.ANDROID_NAVIGATION_VERSION}"
    const val ANDROIDX_NAVIGATION_DYNAMIC_FEATURE = "androidx.navigation:navigation-dynamic-features-fragment:${Versions.ANDROID_NAVIGATION_VERSION}"

    //hilt
    const val HILT_ANDROID = "com.google.dagger:hilt-android:${Versions.ANDROID_HILT_VERSION}"
    const val HILT_COMMON = "androidx.hilt:hilt-common:${Versions.ANDROIDX_HILT_VERSION}"
    const val HILT_ANDROID_COMPILER = "com.google.dagger:hilt-compiler:${Versions.ANDROID_HILT_VERSION}"
    const val HILT_COMPILER = "androidx.hilt:hilt-compiler:${Versions.ANDROIDX_HILT_VERSION}"

    //retrofit
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT_VERSION}"
    const val RETROFIT_MOSHI_CONVERNTER = "com.squareup.retrofit2:converter-moshi:${Versions.RETROFIT_VERSION}"
    const val RETROFIT_GSON_CONVERTER = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT_VERSION}"
    const val MOSHI = "com.squareup.moshi:moshi-kotlin:${Versions.MOSHI_VERSION}"
    const val MOSHICODEGEN = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.MOSHI_VERSION}"
    const val RXJAVA_ADAPTER = "com.squareup.retrofit2:adapter-rxjava2:${Versions.RETROFIT_VERSION}"

    const val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:${Versions.LOGGING_INTERCEPTOR}"

    //Timber
    const val TIMBER = "com.jakewharton.timber:timber:${Versions.TIMBER}"

    //Coroutine
    const val COROUTINE_CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINE}"
    const val COROUTINE_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINE}"

    //apollo
    const val APOLLO_RUNTIME = "com.apollographql.apollo3:apollo-runtime:${Versions.APOLLO_CLIENT}"
    const val APOLLO_API = "com.apollographql.apollo3:apollo-api:${Versions.APOLLO_CLIENT}"
//    const val APOLLO_COROUTINE = "com.apollographql.apollo:apollo-coroutines-support:${Versions.APOLLO_CLIENT}"

    //Sms verification
    const val ANDROID_SMS_VERIFICATION = "com.google.android.gms:play-services-auth-api-phone:${Versions.GOOGLE_PLAY_SERVICE}"

    //lottie
    const val LOTTIE = "com.airbnb.android:lottie:${Versions.LOTTIE}"

    //lokalise
    const val LOKALISE = "com.lokalise.android:sdk:${Versions.LOKALISE}"

    //gson
    const val GSON = "com.google.code.gson:gson:${Versions.GSON}"

    //detect soft keyboard listener
    const val DETECT_SOFT_KEYBOARD = "net.yslibrary.keyboardvisibilityevent:keyboardvisibilityevent:${Versions.DETECT_SOFT_KEYBOARD}"

    //facebook
    const val FACEBOOK = "com.facebook.android:facebook-login:${Versions.FACEBOOK_VERSION}"
    const val FACEBOOK_SDK = "com.facebook.android:facebook-android-sdk:${Versions.FACEBOOK_VERSION}"

    //epoxy
    const val EPOXY = "com.airbnb.android:epoxy:${Versions.EPOXY_VERSION}"
    const val EPOXY_ANNOTATION_PROCESSOR = "com.airbnb.android:epoxy-processor:${Versions.EPOXY_VERSION}"

    //Glide
    const val GLIDE = "com.github.bumptech.glide:glide:${Versions.GLIDE_VERSION}"

    //Exoplayer
    const val EXOPLAYER = "com.google.android.exoplayer:exoplayer:${Versions.EXOPLAYER_VERSION}"
    const val EXOPLAYER_CORE = "com.google.android.exoplayer:exoplayer-core:${Versions.EXOPLAYER_VERSION}"
    const val EXOPLAYER_DASH = "com.google.android.exoplayer:exoplayer-dash:${Versions.EXOPLAYER_VERSION}"
    const val EXOPLAYER_UI = "com.google.android.exoplayer:exoplayer-ui:${Versions.EXOPLAYER_VERSION}"

    //Youtube Player
    const val YOUTUBE_PLAYER = "com.pierfrancescosoffritti.androidyoutubeplayer:core:${Versions.YOUTUBE_PLAYER_VERSION}"

    //firebase
    const val FIREBASE_BOM = "com.google.firebase:firebase-bom:${Versions.FIREBASE_BOM_VERSION}"
    const val FIREBASE_ANALYTICS = "com.google.firebase:firebase-analytics-ktx:${Versions.FIREBASE_ANALYTICS_VERSION}"
    const val FIREBASE_CORE = "com.google.firebase:firebase-core:${Versions.FIREBASE_CORES_VERSION}"

    //Snowplow
    const val SNOWPLOW = "com.snowplowanalytics:snowplow-android-tracker:${Versions.SNOWPLOW_VERSION}"

    //FlexBox
    const val FLEXBOX = "com.google.android.flexbox:flexbox:${Versions.FLEXBOX_VERSION}"

    //ZOOM Image
    const val PHOTOVIEW = "com.github.chrisbanes:PhotoView:${Versions.PHOTOVIEW_VERSION}"

    const val DRAG_SCROLLBAR = "com.github.turing-tech:MaterialScrollBar:${Versions.DRAG_SCROLLBAR_VERSION}"

    const val SWIPE_LAYOUT = "com.github.Android-library-copy-dependencies:SwipeRevealLayout:${Versions.SWIPE_LAYOUT}"

    const val FLIP_VIEW = "com.wajahatkarim:EasyFlipView:${Versions.FLIP_VIEW_VERSION}"
    const val OMISE = "co.omise:omise-android:${Versions.OMISE_VERSION}"
    const val PALATTE = "com.android.support:palette-v7:${Versions.PALATTE_VERSION}"

    const val BROWSER = "androidx.browser:browser:${Versions.BROWSER_VERSION}"

    const val PAGING = "androidx.paging:paging-runtime:${Versions.PAGING_VERSION}"
    const val EPOXY_PAGING = "com.airbnb.android:epoxy-paging3:${Versions.EPOXY_VERSION}"
    const val SPLASH_SCREEN = "androidx.core:core-splashscreen:${Versions.SPLASH_SCREEN_VERSION}"
    const val PLAY_CORE = "com.google.android.play:core:${Versions.PLAY_CORE_VERSION}"
    const val PLAY_CORE_EXTENSION = "com.google.android.play:core-ktx:${Versions.PLAY_CORE_EXTENSION_VERSION}"
    const val FIREBASE_CRASHLYTIC = "com.google.firebase:firebase-crashlytics:${Versions.FIREBASE_CRASHLYTICS_VERSION}"
    const val FIREBASE_REMOTE_CONFIG = "com.google.firebase:firebase-config:${Versions.FIREBASE_REMOTE_CONFIG_VERSION}"
    const val ADJUST_ANALYTIC = "com.adjust.sdk:adjust-android:${Versions.ADJUST_ANALYTIC_VERSION}"
    const val INSTALL_REFERRER = "com.android.installreferrer:installreferrer:${Versions.INSTALL_REFERRER_VERSION}"
    const val GOOGLE_PLAY_SERVICES_ADS_IDENTIFIER = "com.google.android.gms:play-services-ads-identifier:${Versions.GOOGLE_PLAY_SERVICES_ADS_IDENTIFIER_VERSION}"
    const val ONE_TRUST = "com.onetrust.cmp:native-sdk:${Versions.ONE_TRUST}"
    const val FIREBASE_MESSAGING_SERVICE =
        "com.google.firebase:firebase-messaging-ktx:${Versions.FIREBASE_MESSAGING_SERVICE_VERSION}"
    const val QR_GENERATOR =
        "com.github.androidmads:QRGenerator:${Versions.QR_GENERATOR_VERSION}"
    const val EXPANDABLE_LAYOUT =
        "com.github.cachapa:ExpandableLayout:${Versions.EXPANDABLE_LAYOUT_VERSION}"
    const val PERMISSIONS_DISPATCHER =
        "com.github.permissions-dispatcher:ktx:${Versions.PERMISSIONS_DISPATCHER_VERSION}"
    const val RECYCLERVIEW = "androidx.recyclerview:recyclerview:${Versions.RECYCLERVIEW_VERSION}"
    const val LIFECYCLE_COMMON_JAVA_8 =
        "androidx.lifecycle:lifecycle-common-java8:${Versions.LIFECYCLE_COMMON_JAVA_8_VERSION}"
    const val KOTLINX_META_DATA = "org.jetbrains.kotlinx:kotlinx-metadata-jvm:${Versions.KOTLINX_META_DATA_VERSION}"
    const val ANDROID_MATERIAL_COMPOSE_THEME_ADAPTER = "com.google.android.material:compose-theme-adapter:${Versions.ANDROID_MATERIAL_COMPOSE_THEME_ADAPTER_VERSION}"
    const val ACCOMPANIST_THEME = "com.google.accompanist:accompanist-appcompat-theme:${Versions.ACCOMPANIST_THEME_VERSION}"


    object Compose {
        const val COMPOSE_UI = "androidx.compose.ui:ui:${Versions.COMPOSE_UI_VERSION}"
        const val COMPOSE_UI_TOOLING = "androidx.compose.ui:ui-tooling:${Versions.COMPOSE_UI_VERSION}"
        const val COMPOSE_UI_TEST_JUNIT = "androidx.compose.ui:ui-test-junit4:${Versions.COMPOSE_UI_VERSION}"

        const val COMPOSE_RUNTIME_LIVE_DATA = "androidx.compose.runtime:runtime-livedata:${Versions.COMPOSE_RUNTIME_VERSION}"
        const val COMPOSE_RUNTIME_RXJAVA2 = "androidx.compose.runtime:runtime-rxjava2:${Versions.COMPOSE_RUNTIME_VERSION}"

        const val COMPOSE_FOUNDATION = "androidx.compose.foundation:foundation:${Versions.COMPOSE_FOUNDATION_VERSION}"

        const val COMPOSE_MATERIAL = "androidx.compose.material:material:${Versions.COMPOSE_MATERIAL_VERSION}"
        const val COMPOSE_MATERIAL_ICON_CORE = "androidx.compose.material:material-icons-core:${Versions.COMPOSE_MATERIAL_VERSION}"
        const val COMPOSE_MATERIAL_ICON_EXTENDED = "androidx.compose.material:material-icons-extended:${Versions.COMPOSE_MATERIAL_VERSION}"

        const val COMPOSE_ANIMATION = "androidx.compose.animation:animation:${Versions.COMPOSE_ANIMATION_VERSION}"

    }

    object Test {
        const val JUNIT = "junit:junit:${Versions.JUNIT_VERSION}"
        const val ANDROIDX_JUNIT = "androidx.test.ext:junit:${Versions.ANDROID_JUNIT_VERSION}"
        const val ANDROIDX_ESPRESSO =
            "androidx.test.espresso:espresso-core:${Versions.ANDROID_ESPRESSO_VERSION}"
        const val GOOGLE_TRUTH = "com.google.truth:truth:${Versions.GOOGLE_TRUTH_VERSION}"
        const val COROUTINES_TEST =
            "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.COROUTINE_TEST_VERSION}"
        const val CORE_TESTING = "androidx.arch.core:core-testing:${Versions.CORE_TESTING_VERSION}"
        const val TEST_CORE = "androidx.test:core-ktx:${Versions.ANDROIDX_TEST_VERSION}"
        const val TESTING_HILT_ANDROID_TESTING =
            "com.google.dagger:hilt-android-testing:${Versions.ANDROID_HILT_VERSION}"
        const val TESTING_HILT_ANDROID_COMPILER =
            "com.google.dagger:hilt-android-compiler:${Versions.ANDROID_HILT_VERSION}"
        const val TEST_RULE = "androidx.test:rules:${Versions.ANDROIDX_TEST_VERSION}"
        const val TEST_RUNNER = "androidx.test:runner:${Versions.ANDROIDX_TEST_VERSION}"
        const val ROBOLECTRIC = "org.robolectric:robolectric:${Versions.ROBOLECTRIC_VERSION}"

        const val BYTE_BUDDY_ANDROID = "net.bytebuddy:byte-buddy-android:${Versions.BYTE_BUDDY}"
        const val BYTE_BUDDY_AGENT = "net.bytebuddy:byte-buddy-agent:${Versions.BYTE_BUDDY}"
        const val MOCKITO_CORE = "org.mockito:mockito-core:${Versions.MOCKITO}"
        const val MOCKITO_INLINE = "org.mockito:mockito-inline:${Versions.MOCKITO}"
        const val MOCKK = "io.mockk:mockk:${Versions.MOCKK}"
        const val MOCKK_ANDROID = "io.mockk:mockk-android:${Versions.MOCKK}"
    }
}