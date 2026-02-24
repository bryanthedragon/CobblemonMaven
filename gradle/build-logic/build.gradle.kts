plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(libs.kotlin)
    implementation(libs.indra.common)

    implementation(libs.licenser)
    implementation(libs.shadow)
    implementation(libs.loom)
    implementation(libs.architectury)

    implementation(libs.blossom)
    implementation(libs.ideaExt)
}