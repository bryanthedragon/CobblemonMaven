// /*
//  *
//  *  * Copyright (C) 2023 Cobblemon Contributors
//  *  *
//  *  * This Source Code Form is subject to the terms of the Mozilla Public
//  *  * License, v. 2.0. If a copy of the MPL was not distributed with this
//  *  * file, You can obtain one at https://mozilla.org/MPL/2.0/.
//  *
//  */

// configurations.all {
//     resolutionStrategy {
//         force(libs.fabric.loader)
//     }
// }

// plugins {
//     id("cobblemon.platform-conventions")
//     id("cobblemon.publish-conventions")
// }

// architectury {
//     platformSetupLoomIde()
//     fabric()
// }

// val generatedResources = file("src/generated/resources")

// sourceSets {
//     main {
//         resources {
//             srcDir(generatedResources)
//         }
//     }
// }

// repositories {
//     maven(url = "${rootProject.projectDir}/deps")
//     mavenLocal()
//     maven("https://oss.sonatype.org/content/repositories/snapshots")
//     maven(url = "https://api.modrinth.com/maven")
// }

// dependencies {
//     implementation(project(":common", configuration = "namedElements")) {
//         isTransitive = false
//     }
//     "developmentFabric"(project(":common", configuration = "namedElements")) {
//         isTransitive = false
//     }
//     bundle(project(path = ":common", configuration = "transformProductionFabric")) {
//         isTransitive = false
//     }

//     modImplementation(libs.fabric.loader)
//     modApi(libs.fabric.api)
//     modApi(libs.bundles.fabric)

//     // ✅ FIXED — unwrap bundle
//     libs.bundles.fabric.integrations.compileOnly.get().forEach {
//         modCompileOnly(it) {
//             isTransitive = false
//         }
//     }
//     modRuntimeOnly(libs.jei.fabric)

//     listOf(libs.bundles.kotlin, libs.bundles.fabric.kotlin.deps, libs.graal, libs.molang).forEach {
//         bundle(it)
//         runtimeOnly(it)
//     }

//     minecraftServerLibraries(libs.icu4j)
// }