# Paper Plugin Template

Template for creating [Paper](https://papermc.io) Plugins with Paper Userdev.

## How to use

1. Click on [**Use this template**](../../generate) at the top of this page.
2. Fill in the repository details and click on "Create repository fromm this template".
3. Open your repository in the [**IntelliJ IDEA**](https://www.jetbrains.com/de-de/idea/).
4. Change the project name in the [**settings.gradle.kts**](/settings.gradle.kts#L1).
5. Change your group id and version in the [**build.gradle.kts**](/build.gradle.kts#L10-L11).
6. Change the plugin.yml which is automatically generated in the [**build.gradle.kts**](/build.gradle.kts#L47-L55).
7. Lastly, rename the package and the main-class.

## Versions

- Java Language Version: **17**
- Minecraft Version: **1.19.2 (change in the build.gradle.kts)**

## Building

This template uses [**Gradle (Kotlin DSL)**](https://docs.gradle.org/current/userguide/kotlin_dsl.html) to build.
Run the following command in shell to build:
```shell
./gradlew clean assemble
```

## RyseInventory
This project has already implemented version 1.5.2 of [**RyseInventory**](https://github.com/Rysefoxx/RyseInventory).
RyseInventory is a library to create Inventory's and GUI's. If you dont wish to use it, remove line [*44*](/build.gradle.kts#L44) from the build.gradle.kts.

## License

Please note, that this template is [licensed](LICENSE) under the [MIT License](https://choosealicense.com/licenses/mit/).

Copyright (c) 2022 eazypaulCode