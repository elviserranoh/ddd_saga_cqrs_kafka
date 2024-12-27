plugins {
    id("java")
    id("org.springframework.boot") version "3.2.1"
    id("io.spring.dependency-management") version "1.1.6"
}

allprojects {

    group = "com.food.ordering.system"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenLocal()
        mavenCentral()
    }
}

subprojects {
    apply {
        plugin("java")
        plugin("org.springframework.boot")
        plugin("io.spring.dependency-management")
    }

    java {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    dependencies {
        implementation("org.springframework.boot:spring-boot-starter")

        compileOnly("org.projectlombok:lombok")
        annotationProcessor("org.projectlombok:lombok")
    }

    dependencyManagement {
        imports {
            mavenBom(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES)
        }

        dependencies {
            dependency("com.food.ordering.system:order-domain-core:${project.version}")
            dependency("com.food.ordering.system:order-application-service:${project.version}")
            dependency("com.food.ordering.system:order-application:${project.version}")
            dependency("com.food.ordering.system:order-dataaccess:${project.version}")
            dependency("com.food.ordering.system:order-messaging:${project.version}")
            dependency("com.food.ordering.system:common-domain:${project.version}")
        }
    }

}
