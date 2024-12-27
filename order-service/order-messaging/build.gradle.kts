plugins {
    id("java")
}

group = "com.food.ordering.system"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation(project(":order-service:order-domain:order-application-service"))

}

tasks.test {
    useJUnitPlatform()
}