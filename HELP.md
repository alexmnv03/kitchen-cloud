# Микросервисная система  тестирования системы управления
# тестовая, подготовительная версия


future-01/add-cloud-common-postgresqld
future-02/add-cloud-domain-postgresqld

# new
com.kitchen

cloud-domain-postgresqldb
cloud-common-postgresqldb
cloud-kitchen-postgresqldb

cloud-web-api
cloud-

Структура проекта
cloud-common-postgresqldb - описнание всех сущностей проекта для БД postgresql
cloud-domain-postgresqldb - микросервис работы с БД postgresql
cloud-kitchen-postgresqldb - микросервис обработки заказов
cloud-web-api - REST API для обмена данными с web интерфейсом
cloud-web-ui - web интерфейс

Получаем запрос с web интерфейса cloud-web-ui помечается признаком прием и передаем его с помщью kafka cloud-domain-postgresqldb, там он сохраняется в БД, помечается признаком SAVE и с помщью kafka передается на микросервис обработки заказов cloud-kitchen-postgresqldb, после выполнения заказа, он помечается призанком выполнен и с помщью kafka передается на микросервис cloud-domain-postgresqldb, где обновляется его статус



com.goodfood

com.kitchen

buritto

# old
cloud-domain-postgresqldb
cloud-domain-mongodb
cloud-domain-cassandra
cloud-data-mongodb
cloud-data-postgresqldb
cloud-data-cassandra



tacocloud-data-mongodb


Mexican food

cloud-domain-db
cloud-data-mongodb-react


mexican-food
