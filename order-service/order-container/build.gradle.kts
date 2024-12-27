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

    implementation(project(":order-service:order-domain:order-domain-core"))
    implementation(project(":order-service:order-domain:order-application-service"))
    implementation(project(":order-service:order-application"))
    implementation(project(":order-service:order-dataaccess"))
    implementation(project(":order-service:order-messaging"))

}

tasks.test {
    useJUnitPlatform()
}