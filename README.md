[![Build status](https://ci.appveyor.com/api/projects/status/98su6je614xb0nbf/branch/main?svg=true)](https://ci.appveyor.com/project/KatyaQA91/graduate-work/branch/main)

# Дипломный проект по профессии «Тестировщик»
## Запуск автотестов
### Используемое ПО:

1. IntelliJ IDEA
2. Docker Desktop
3. Браузер, например, Google Chrome

### Установка и запуск программы:

1. Склонируйте репозиторий по [ссылке](https://github.com/KatyaQA91/graduate_work).
2. Запустить Docker Desktop
3. Откройте проект в IntelliJ IDEA
4. Запуск БД : docker-compose up 
5. Запуск JAR- файла: java -jar ./artifacts/aqa-shop.jar
6. Открыть браузер и открыть приложение по адресу: http://localhost:8080/.
7. Запустить тесты командой: ./gradlew clean test.

### Подготовка отчетов:

1. Для геннерации отчетов введите команду: ./gradlew allureServe;
2. После генерации отчет откроется в окне браузера.
