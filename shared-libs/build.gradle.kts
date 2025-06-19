plugins {
    //trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.androidLibrary).apply(false)
    alias(libs.plugins.kotlinMultiplatform).apply(false)
    alias(libs.plugins.kotlinCocoapods).apply(false)
    alias(libs.plugins.android.kotlin.multiplatform.library) apply false
}

// --- Pod install automation ---
tasks.register("generatePodspecs") {
    dependsOn(":lib-a-shared:podspec", ":lib-b-shared:podspec")
}

tasks.register<Exec>("podInstall") {
    dependsOn("generatePodspecs")
    workingDir = file("../KmpIntegrationIOS")
    commandLine("pod", "Install")
}
