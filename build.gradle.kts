plugins {
    id("cobblemon.root-conventions")
}

version = "${project.property("mod_version")}+${project.property("mc_version")}"

val isSnapshot = project.property("snapshot")?.equals("true") ?: false

if (isSnapshot) {
    val branch = providers.exec {commandLine("git", "rev-parse", "--abbrev-ref", "HEAD")}.standardOutput.asText.get().trim()
    val commit = providers.exec {commandLine("git", "rev-parse", "--short", "HEAD")}.standardOutput.asText.get().trim()
    val fixedBranchName = branch.substringAfter("/")
    version = "$version-$fixedBranchName-$commit"
}