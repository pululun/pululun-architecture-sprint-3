# Сборка и запуск проекта со всеми зависимостями

## Описание моналита [README.md](smart-home-monolith%2FREADME.md)

### Интерация с монолитом не требуется, так как весь функционал был полностью перенесён на микросервисы!

### C4 [diagrams](microservices%2Fdiagrams), [API.yml](microservices%2FAPI.yml), [DDD.md](microservices%2FDDD.md), Диаграмма [ER.puml](microservices%2Fdiagrams%2FER%2FER.puml) можно посмотреть в каталоге "[microservices](microservices)"

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
