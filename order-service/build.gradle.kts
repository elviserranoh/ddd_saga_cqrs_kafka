plugins {
    id("java-library")
}

group = "com.food.ordering.system"
version = "1.0-SNAPSHOT"

subprojects {
    project(":order-service:order-domain:order-domain-core")
    project(":order-service:order-domain:order-application-service")
    project(":order-service:order-application")
    project(":order-service:order-dataaccess")
    project(":order-service:order-messaging")
    project(":order-service:order-container")
}