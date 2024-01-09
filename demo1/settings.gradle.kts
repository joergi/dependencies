rootProject.name = "demo1"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            version("springboot", "3.2.1")
            version("jacksonKotlin", "2.16.1")
            version("kotlinReflect", "1.9.22")
            version("lombok", "1.18.28")

            version("kotlin", "1.9.22")
            version("junit-jupiter", "5.10.1")
            version("hamkrest", "1.8.0.1")

            library("springBootStarterWeb","org.springframework.boot","spring-boot-starter-web").versionRef("springboot")
            library("springBootStarterTest", "org.springframework.boot", "spring-boot-starter-test").versionRef("springboot")

            library("jacksonKotlinModule", "com.fasterxml.jackson.module", "jackson-module-kotlin").versionRef("jacksonKotlin")
            library("kotlinReflect", "org.jetbrains.kotlin", "kotlin-reflect").versionRef("kotlinReflect")
            library("lombok", "org.projectlombok", "lombok").versionRef("lombok")

        }
    }
}