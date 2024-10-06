# Сборка и запуск проекта со всеми зависимостями

## Описание моналита [README.md](smart-home-monolith%2FREADME.md)

### Интерация с монолитом не требуется, так как весь функционал был полностью перенесён на микросервисы!

### C4 [diagrams](microservices%2Fdiagrams), [API.yml](microservices%2FAPI.yml), [DDD.md](microservices%2FDDD.md), Диаграмма [ER.puml](microservices%2Fdiagrams%2FER%2FER.puml) можно посмотреть в каталоге "[microservices](microservices)"

## Краткое описание работы микросервисов:  
Есть микросервис "smart-home-sensors-box", этот микросервис работает на устройстве (device) устанавливаемом в доме (характеристики и технологии есть на диаграмме контэйнеров), к этому устройству подключаются разные датчики, которые из себя представляют модули (Module) которые легко можно заменить или добавить несколько по разным интерфейсам (Проводные\безпроводные) разных производителей.  
Так же каждому модулю присваивается уникальный id (SN может повторяться или если датик Б\У и работал у другого пользователя), так как у одного пользователя в доме может быть несколько девайсов и к каждому девайсу может быть подключено n количество датчиков (Module).  
Так же хочу упомянуть, что кафка работает в отдельной изолированной сети (шлюзе) которая формируется на базе VPN, и защищена сертификатами.

## Сборка и запуск
```shell
docker-compose up -d 
```

## Остановка и удаление
```shell
docker-compose down
```

## Проверить работоспособность эндпоинта мкс "[smart-home-telemetry](smart-home-telemetry)" через GW
```shell
curl -X 'GET' 'http://localhost/telemetry/1' -H 'accept: application/json'
```
## Swagger доступен по адресу: 
http://localhost:8080/telemetry/swagger-ui/index.html#


## Проверить работоспособность эндпоинта мкс "[smart-home-device](smart-home-device)"через GW
```shell
curl -X 'GET' 'http://localhost/devices/1' -H 'accept: application/json'
```
## Swagger доступен по адресу: 
http://localhost:8086/devices/swagger-ui/index.html#

### Запросы через GW ходят все, но swagger работать не будет, требуется донастройка!
