val javaVersion = 17

plugins {
    java // Java Plugin
    id("io.papermc.paperweight.userdev") version "1.3.11" // Paper Userdev
    id("com.github.johnrengelman.shadow") version ("7.1.2") // Shading
    id("net.minecrell.plugin-yml.bukkit") version "0.5.2" // plugin.yml in this file (L47-L55)
}

group = "my.groupid"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(javaVersion))
    }
}

tasks {
    jar {
        enabled = false
    }

    shadowJar {
        mergeServiceFiles()
    }

    withType<JavaCompile> {
        options.encoding = "UTF-8"
        options.release.set(javaVersion)
    }

    assemble {
        dependsOn(reobfJar, shadowJar)
    }
}

dependencies {
    paperDevBundle("1.19.3-R0.1-SNAPSHOT") // Paper
    implementation("io.github.rysefoxx:RyseInventory-Plugin:1.5.2") // RyseInventory Inventory API
}

/* Adjust to your needs */
bukkit {
    name = "MyPlugin"
    apiVersion = "1.19"
    authors = listOf(
        "YourName",
    )
    main = "$group.myplugin.MyPlugin"
    version = getVersion().toString()
}