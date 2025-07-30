
rootProject.name = "traktor-streaming-proxy"

includeBuild("../spotify-kt") {
    dependencySubstitution {
        substitute(module("com.github.0xf4b1:spotify-kt")).using(project(":"))
    }
}
