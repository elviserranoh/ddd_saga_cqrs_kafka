plugins {
    id("java-library")
}

group = "com.food.ordering.system"
version = "1.0-SNAPSHOT"

subprojects {
    project(":common:common-domain")
}