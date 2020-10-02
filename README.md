## Installation
- install gradle with homebrew
- which gradle - to find the path
  - /usr/local/Cellar/gradle/6.6.1/

## Learning Gradle with single java project
- gradle clean // clean build dir
- gradle compileJava // compile
- gradle assemble // compile + jar
- gradle build // compile + jar + run tests
- gradle // defaultTasks -> clean, build, packageDistribution

## Run commands
- gradle  
  - generates jar in **./build/libs/**
  - generates distribution zip in **./build/distributions/distPackage-1.0.zip**
- java -jar ./build/libs/myHelloWorld-1.0-SNAPSHOT.jar