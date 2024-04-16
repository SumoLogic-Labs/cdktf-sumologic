plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.hashicorp:cdktf:0.20.7")
    implementation("software.constructs:constructs:10.3.0")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(8)
    }
}
