plugins {
    id("org.springframework.boot") version "2.7.14"
    java
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":Demo-Model"))
    implementation(platform(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES))
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    compileOnly("org.projectlombok:lombok:latest.release")
    annotationProcessor("org.projectlombok:lombok:latest.release")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
