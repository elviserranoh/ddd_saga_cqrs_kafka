rootProject.name = "food-ordering-system"

include("common:common-domain")
project(":common:common-domain").projectDir = file("common/common-domain")

include("order-service:order-application")
project(":order-service:order-application").projectDir = file("order-service/order-application")

include("order-service:order-container")
project(":order-service:order-container").projectDir = file("order-service/order-container")

include("order-service:order-dataaccess")
project(":order-service:order-dataaccess").projectDir = file("order-service/order-dataaccess")

include("order-service:order-domain:order-domain-core")
project(":order-service:order-domain:order-domain-core").projectDir = file("order-service/order-domain/order-domain-core")

include("order-service:order-domain:order-application-service")
project(":order-service:order-domain:order-application-service").projectDir = file("order-service/order-domain/order-application-service")

include("order-service:order-messaging")
project(":order-service:order-messaging").projectDir = file("order-service/order-messaging")

include("common:common-domain")
project(":common:common-domain").projectDir = file("common/common-domain")