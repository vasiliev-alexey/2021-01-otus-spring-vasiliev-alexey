# Домашние Задания

<details>
  <summary>Домашнее задание № 1</summary>

#### Цель: создать приложение с помощью Spring IoC, чтобы познакомиться с основной функциональностью IoC, на которой строится весь Spring.

#### Результат: простое приложение, сконфигурированное XML-контекстом.

#### Описание задание:

- В ресурсах хранятся вопросы и различные ответы к ним в виде CSV файла (5 вопросов).
- Вопросы могут быть с выбором из нескольких вариантов или со свободным ответом - на Ваше желание и усмотрение.
- Приложение должна просто вывести вопросы теста из CSV-файла с возможными вариантами ответа.

#### Требования:

0. В приложении должна присутствовать объектная модель (отдаём предпочтение объектам и классам, а не строчкам и массивам/спискам строчек).
1. Все классы в приложении должны решать строго определённую задачу (см. п. 18-19 "Правила оформления кода.pdf", прикреплённые к материалам занятия).
2. Контекст описывается XML-файлом.
3. Все зависимости должны быть настроены в IoC контейнере.
4. Имя ресурса с вопросами (CSV-файла) необходимо захардкодить строчкой в XML-файле с контекстом.
5. CSV с вопросами читается именно как ресурс, а не как файл.
6. Scanner, PrintStream и другие стандартные типы в контекст класть не нужно!
7. Весь ввод-вывод осуществляется на английском языке.
8. Крайне желательно написать юнит-тест какого-нибудь сервиса (оцениваться будет только попытка написать тест).
9. Помним - "без фанатизма".

</details>

<details>
  <summary>Домашнее задание № 2</summary>

    # Приложение по проведению тестирования студентов (с самим тестированием)

    ## Цель: Цель: конфигурировать Spring-приложения современным способом, как это и делается в современном мире

    ### Результат: готовое современное приложение на чистом Spring

    #### Новый функционал:

    * Программа должна спросить у пользователя фамилию и имя, спросить 5 вопросов из CSV-файла и вывести результат тестирования.
    * Выполняется на основе предыдущего домашнего задания + , собственно, сам функционал тестирования.

    #### Требования:
    1. Переписать конфигурацию в виде Java + Annotation-based конфигурации.
    2. Добавить функционал тестирования студента.
    3. Добавьте файл настроек для приложения тестирования студентов.
    4. В конфигурационный файл можно поместить путь до CSV-файла, количество правильных ответов для зачёта - на Ваше усмотрение.
    5. Если Вы пишите интеграционные тесты, то не забудьте добавить аналогичный файл и для тестов.
    6. Scanner, PrintStream и другие стандартные типы в контекст класть не нужно!
    7. Ввод-вывод на английском языке.
    8. Помним, "без фанатизма" :)

Задание сдаётся в виде ссылки на pull-request в чат с преподавателем.
</details>


<details>
  <summary>Домашнее задание № 3</summary>  

# Перенести приложение для тестирования студентов на Spring Boot

## Цель: Цель: использовать возможности Spring Boot, чтобы разрабатывать современные приложения, так, как их сейчас и разрабатывают.

### Результат: Production-ready приложение на Spring Boot

Это домашнее задание выполняется на основе предыдущего.

1. Создать проект, используя Spring Boot Initializr (https://start.spring.io)
2. Перенести приложение проведения опросов из прошлого домашнего задания.
3. Перенести все свойства в application.yml
4. Локализовать выводимые сообщения и вопросы (в CSV-файле). MessageSource должен быть из автоконфигурации Spring Boot.
5. Сделать собственный баннер для приложения.
6. Перенести тесты и использовать spring-boot-test-starter для тестирования

*Опционально:

- использовать ANSI-цвета для баннера.
- если Ваш язык отличается от русского и английского - локализовать в нём.

Коммитить wrapper или нет в репозиторий - решать Вам.

Задание сдаётся в виде ссылки на pull-request в чат с преподавателем. Вопросы можно задавать в чате, но для
оперативности рекомендуем Slack.

Написанное приложение будет использоваться в ДЗ №4 (к занятию №5). Данное задание засчитывает ДЗ №1 (к занятию №1) и ДЗ
№2 (к занятию №2). Если Вы хотите засчитать, то обязательно пришлите ссылку в чат соответствующего предыдущего занятия.

</details>

<details>
  <summary>Домашнее задание № 4</summary>

## Перевести приложение для проведения опросов на Spring Shell

### Цель: После выполнения ДЗ вы сможете использовать Spring Shell, чтобы писать интерфейс приложения без Web.

### Результат: Приложение на Spring Shell

Домашнее задание выполняется на основе предыдущего.

#### Необходимо:

1. Подключить Spring Shell, используя spring-starter.
2. Написать набор команд, позволяющий проводить опрос.
3. Написать Unit-тесты с помощью spring-boot-starter-test, учесть, что Spring Shell в тестах нужно отключить.

- Набор команд зависит только от Вашего желания. Вы можете сделать одну команду, запускающую Ваш Main, а можете построить полноценный интерфейс на Spring Shell.

- Локализовывать команды Spring Shell НЕ НУЖНО (хотя можно, но это долго и непросто).

- Задание сдаётся в виде ссылки на pull-request в чат с преподавателем.

#### Критерии оценки:

##### Факт сдачи:

- 0 - задание не сдано
- 1 - задание сдано

##### Степень выполнения (количество работающего функционала, что примет заказчик, что будет проверять тестировщик):

- 0 - ничего не работает или отсутствует основной функционал
- 1 - не работает или отсутствует большая часть критического функционала
- 2 - основной функционал есть, возможны небольшие косяки
- 3 - основной функционал есть, всё хорошо работает
- 4 - основной функционал есть, всё хорошо работает, тесты и/или задание перевыполнено

##### Способ выполнения (качество выполнения, стиль кода, как ревью перед мержем):

- 0 - нужно править, мержить нельзя (нарушение соглашений, публичные поля)
- 1 - лучше исправить в рамках этого ДЗ для повышения оценки
- 2 - можно мержить, но в следующих ДЗ нужно поправить.
- 3 - можно мержить, мелкие недочёты
- 4 - отличная работа!
- 5 - экстра балл за особо красивый кусочек кода/решение целиком (ставится только после отличной работы, отдельно не ставится)
</details>


<details>
  <summary>Домашнее задание № 5</summary>

### Создать приложение хранящее информацию о книгах в библиотеке

#### Цель: использовать возможности Spring JDBC и spring-boot-starter-jdbc для подключения к реляционным базам данных Результат: приложение с хранением данных в реляционной БД, которое в дальнейшем будем развивать

### Описение решения

Это домашнее задание выполняется НЕ на основе предыдущего.

*  Использовать Spring JDBC и реляционную базу (H2 или настоящую реляционную БД). Настоятельно рекомендуем использовать NamedParametersJdbcTemplate
*    Предусмотреть таблицы авторов, книг и жанров.
*    Предполагается отношение многие-к-одному (у книги один автор и жанр). Опциональное усложнение - отношения многие-ко-многим (у книги может быть много авторов и/или жанров).
*    Интерфейс выполняется на Spring Shell (CRUD книги обязателен, операции с авторами и жанрами - как будет удобно).
*    Скрипт создания таблиц и скрипт заполнения данными должны автоматически запускаться с помощью spring-boot-starter-jdbc.
*    Покрыть тестами, насколько это возможно.

#### Рекомендации к выполнению работы:

*    НЕ делать AbstractDao.
*    НЕ делать наследования в тестах

Это домашнее задание является основой для следующих.

#### Критерии оценки:

###### Факт сдачи:

*    0 - задание не сдано
*    0 - ничего не работает или отсутствует основной функционал
*    1 - задание сдано Степень выполнения (количество работающего функционала, что примет заказчик, что будет проверять тестировщик):
*    1 - не работает или отсутствует большая часть критического функционала
*    2 - основной функционал есть, возможны небольшие косяки
*    3 - основной функционал есть, всё хорошо работает
*    4 - основной функционал есть, всё хорошо работает, тесты и/или задание перевыполнено 
     
###### Способ выполнения (качество выполнения, стиль кода, как ревью перед мержем):

*    0 - нужно править, мержить нельзя (нарушение соглашений, публичные поля)
*    1 - лучше исправить в рамках этого ДЗ для повышения оценки
*    2 - можно мержить, но в следующих ДЗ нужно поправить.
*    3 - можно мержить, мелкие недочёты
*    4 - отличная работа!
*    5 - экстра балл за особо красивый кусочек кода/решение целиком (ставится только после отличной работы, отдельно не ставится)

 
--- 
Поднимаем БД
```dockerfile
docker-compose up
```

Комманды для shell
---

Создать книгу
* Наименование
* Номер издания
* ИСБН
```
new-book "simple book11211" 1 "isbn1"

```

Установить авторов для создаваемой книги
* Имя автора

```
set-author-to-new-book "Jon Daw"
set-author-to-new-book "Егор Бугаенко"

```

```shell
set-genre-to-new-book "computer science"

```


Сохранить созданную книгу
```shell
save-book
```

Показать книги
```shell
show-books
```
</details> 


<details>
  <summary>Домашнее задание № 6</summary>

### Переписать приложение для хранения книг на ORM

#### Цель: Полноценно работать с JPA + Hibernate для подключения к реляционным БД посредством ORM-фреймворка

#### Результат: Высокоуровневое приложение с JPA-маппингом сущностей



### Описение решения

Требования:

*    Использовать JPA, Hibernate только в качестве JPA-провайдера.
*    Для решения проблемы N+1 можно использовать специфические для Hibernate аннотации @Fetch и @BatchSize.
*    Добавить сущность "комментария к книге", реализовать CRUD для новой сущности.
*    Покрыть репозитории тестами, используя H2 базу данных и соответствующий H2 Hibernate-диалект для тестов.
*    Не забудьте отключить DDL через Hibernate
*    @Transactional рекомендуется ставить только на методы сервиса.

#### Рекомендации к выполнению работы:

* Это домашнее задание будет использоваться в качестве основы для других ДЗ Данная работа не засчитывает предыдущую!
*  Это домашнее задание является основой для следующих.

#### Критерии оценки:

###### Факт сдачи:

*    0 - задание не сдано
*    0 - ничего не работает или отсутствует основной функционал
*    1 - задание сдано Степень выполнения (количество работающего функционала, что примет заказчик, что будет проверять тестировщик):
*    1 - не работает или отсутствует большая часть критического функционала
*    2 - основной функционал есть, возможны небольшие косяки
*    3 - основной функционал есть, всё хорошо работает
*    4 - основной функционал есть, всё хорошо работает, тесты и/или задание перевыполнено 
     
###### Способ выполнения (качество выполнения, стиль кода, как ревью перед мержем):

*    0 - нужно править, мержить нельзя (нарушение соглашений, публичные поля)
*    1 - лучше исправить в рамках этого ДЗ для повышения оценки
*    2 - можно мержить, но в следующих ДЗ нужно поправить.
*    3 - можно мержить, мелкие недочёты
*    4 - отличная работа!
*    5 - экстра балл за особо красивый кусочек кода/решение целиком (ставится только после отличной работы, отдельно не ставится)


--- 
Поднимаем БД
```dockerfile
docker-compose up
```

Комманды для shell
---

Создать книгу
* Наименование
* Номер издания
* ИСБН
```
new-book "simple book11211" 1 "isbn1"

```

Установить авторов для создаваемой книги
* Имя автора

```
set-author-to-new-book "Jon Daw"
set-author-to-new-book "Егор Бугаенко"

```

Установить Жанр для создаваемой книги
* Имя жанра

```shell
set-genre-to-new-book "computer science"

```

Установить Комменарий для создаваемой книги
* Автор коменатрия 
* Текст комментария

```shell
add-comment "Евгений Борисов" "Very nice book"

```

Сохранить созданную книгу
```shell
save-book
```

Показать книги
```shell
show-books
```

</details>



<details>
  <summary>Домашнее задание № 7</summary>

### Переписать приложение Библиотека на Spring Data JPA

#### Цель: Полноценно работать с JPA + Hibernate для подключения к реляционным БД посредством ORM-фреймворка

#### Результат: приложение со слоем репозиториев на Spring Data JPA



### Описение решения

Требования:

* Переписать все репозитории по работе с книгами на Spring Data JPA репозитории.
* Используйте spring-boot-starter-data-jpa.
* Кастомные методы репозиториев (или с хитрым @Query) покрыть тестами, используя H2.
* @Transactional рекомендуется ставить на методы сервисов, а не репозиториев.

#### Рекомендации к выполнению работы:

* Это домашнее задание будет использоваться в качестве основы для других ДЗ Данная работа не засчитывает предыдущую!
*  Это домашнее задание является основой для следующих.

#### Критерии оценки:

###### Факт сдачи:

*    0 - задание не сдано
*    0 - ничего не работает или отсутствует основной функционал
*    1 - задание сдано Степень выполнения (количество работающего функционала, что примет заказчик, что будет проверять тестировщик):
*    1 - не работает или отсутствует большая часть критического функционала
*    2 - основной функционал есть, возможны небольшие косяки
*    3 - основной функционал есть, всё хорошо работает
*    4 - основной функционал есть, всё хорошо работает, тесты и/или задание перевыполнено

###### Способ выполнения (качество выполнения, стиль кода, как ревью перед мержем):

*    0 - нужно править, мержить нельзя (нарушение соглашений, публичные поля)
*    1 - лучше исправить в рамках этого ДЗ для повышения оценки
*    2 - можно мержить, но в следующих ДЗ нужно поправить.
*    3 - можно мержить, мелкие недочёты
*    4 - отличная работа!
*    5 - экстра балл за особо красивый кусочек кода/решение целиком (ставится только после отличной работы, отдельно не ставится)


--- 
Поднимаем БД
```dockerfile
docker-compose up
```

Комманды для shell
---

Создать книгу
* Наименование
* Номер издания
* ИСБН
```
new-book "simple book11211" 1 "isbn1"

```

Установить авторов для создаваемой книги
* Имя автора

```
set-author-to-new-book "Jon Daw"
set-author-to-new-book "Егор Бугаенко"

```

Установить Жанр для создаваемой книги
* Имя жанра

```shell
set-genre-to-new-book "computer science"

```

Установить Комменарий для создаваемой книги
* Автор коменатрия
* Текст комментария

```shell
add-comment "Евгений Борисов" "Very nice book"

```

Сохранить созданную книгу
```shell
save-book
```

Показать книги
```shell
show-books
```

Наполнить бд фейковыми данными

* Количество фейковых данных

```shell
seed-data 1
```

</details>



<details>
<summary>Домашнее задание № 8
</summary>


### Использовать MongoDB и spring-data для хранения информации о книгах

#### Цель: После выполнения ДЗ вы сможете использовать Spring Data MongoDB и саму MongoDB для разработки приложений с хранением данных в нереляционной БД. Результат: Приложение с использованием MongoDB

#### Результат: приложение со слоем репозиториев на Spring Data JPA c поддержкой Mongo


### Описание решения

Требования:



*   Использовать Spring Data MongoDB репозитории, а если не хватает функциональности, то и *Operations
*   Тесты можно реализовать с помощью Flapdoodle Embedded MongoDB
    Hibernate, равно, как и JPA, и spring-boot-starter-data-jpa не должно остаться в зависимостях, если ДЗ выполняется на основе предыдущего.
*   Как хранить книги, авторов, жанры и комментарии решать Вам. Но перенесённая с реляционной базы структура не всегда будет подходить для MongoDB.
*    Использовать Spring Data MongoDB репозитории, а если не хватает функциональности, то и Operations

#### Рекомендации к выполнению работы:

* Данное задание НЕ засчитывает предыдущие!

#### Критерии оценки:

###### Факт сдачи:

* 0 - задание не сдано
* 0 - ничего не работает или отсутствует основной функционал
* 1 - задание сдано Степень выполнения (количество работающего функционала, что примет заказчик, что будет проверять
  тестировщик):
* 1 - не работает или отсутствует большая часть критического функционала
* 2 - основной функционал есть, возможны небольшие косяки
* 3 - основной функционал есть, всё хорошо работает
* 4 - основной функционал есть, всё хорошо работает, тесты и/или задание перевыполнено

###### Способ выполнения (качество выполнения, стиль кода, как ревью перед мержем):

* 0 - нужно править, мержить нельзя (нарушение соглашений, публичные поля)
* 1 - лучше исправить в рамках этого ДЗ для повышения оценки
* 2 - можно мержить, но в следующих ДЗ нужно поправить.
* 3 - можно мержить, мелкие недочёты
* 4 - отличная работа!
* 5 - экстра балл за особо красивый кусочек кода/решение целиком (ставится только после отличной работы, отдельно не
  ставится)


--- 
Поднимаем БД

```dockerfile
docker-compose up
```

Комманды для shell
---

Создать книгу

* Наименование
* Номер издания
* ИСБН

```
new-book "simple book11211" 1 "isbn1"

```

Установить авторов для создаваемой книги

* Имя автора

```
set-author-to-new-book "Jon Daw"
set-author-to-new-book "Егор Бугаенко"

```

Установить Жанр для создаваемой книги

* Имя жанра

```shell
set-genre-to-new-book "computer science"

```

Установить Комменарий для создаваемой книги

* Автор коменатрия
* Текст комментария

```shell
add-comment "Евгений Борисов" "Very nice book"

```

Сохранить созданную книгу

```shell
save-book
```

Показать книги

```shell
show-books
```

Наполнить бд фейковыми данными

* Количество фейковых данных

```shell
seed-data 1
```


</details>



<details>
<summary>Домашнее задание № 9
</summary>


### CRUD приложение с Web UI и хранением данных в БД

#### Цель: разрабатывать полноценные классические Web-приложения 

#### Результат: Web-приложение полностью на стеке Spring

### Описание решения

Требования:

* Cоздать приложение с хранением сущностей в БД (можно взять библиотеку и DAO/репозитории из прошлых занятий)
* Использовать классический View на Thymeleaf, classic Controllers.
* Для книг (главной сущности) на UI должны быть доступные все CRUD операции. CRUD остальных сущностей - по желанию/необходимости.
* Локализацию делать НЕ нужно - она строго опциональна.

#### Рекомендации к выполнению работы:

* Данное задание НЕ засчитывает предыдущие!
* Это домашнее задание частично будет использоваться в дальнейше

#### Критерии оценки:

###### Факт сдачи:

* 0 - задание не сдано
* 0 - ничего не работает или отсутствует основной функционал
* 1 - задание сдано Степень выполнения (количество работающего функционала, что примет заказчик, что будет проверять
  тестировщик):
* 1 - не работает или отсутствует большая часть критического функционала
* 2 - основной функционал есть, возможны небольшие косяки
* 3 - основной функционал есть, всё хорошо работает
* 4 - основной функционал есть, всё хорошо работает, тесты и/или задание перевыполнено

###### Способ выполнения (качество выполнения, стиль кода, как ревью перед мержем):

* 0 - нужно править, мержить нельзя (нарушение соглашений, публичные поля)
* 1 - лучше исправить в рамках этого ДЗ для повышения оценки
* 2 - можно мержить, но в следующих ДЗ нужно поправить.
* 3 - можно мержить, мелкие недочёты
* 4 - отличная работа!
* 5 - экстра балл за особо красивый кусочек кода/решение целиком (ставится только после отличной работы, отдельно не
  ставится)

--- 
Поднимаем БД

```dockerfile
docker-compose up
```



</details>



<details>
<summary>
Домашнее задание № 12
</summary>

### В CRUD Web-приложение добавить механизм аутентификации

#### Цель: защитить Web-приложение аутентифкацией и простой авторизацией Результат: приложение с использованием Spring Security

#### Результат: Web-приложение полностью на стеке Spring




### Описание решения

Требования:


*   Добавить в приложение новую сущность - пользователь. Не обязательно реализовывать методы по созданию пользователей - допустимо добавить пользователей только через БД-скрипты.
*   В существующее CRUD-приложение добавить механизм Form-based аутентификации.
*   UsersServices реализовать самостоятельно.
*   Авторизация на всех страницах - для всех аутентифицированных. Форма логина - доступна для всех.

#### Рекомендации к выполнению работы:

* Данное задание НЕ засчитывает предыдущие!
* Это домашнее задание частично будет использоваться в дальнейше

#### Критерии оценки:

###### Факт сдачи:

* 0 - задание не сдано
* 0 - ничего не работает или отсутствует основной функционал
* 1 - задание сдано Степень выполнения (количество работающего функционала, что примет заказчик, что будет проверять
  тестировщик):
* 1 - не работает или отсутствует большая часть критического функционала
* 2 - основной функционал есть, возможны небольшие косяки
* 3 - основной функционал есть, всё хорошо работает
* 4 - основной функционал есть, всё хорошо работает, тесты и/или задание перевыполнено

###### Способ выполнения (качество выполнения, стиль кода, как ревью перед мержем):

* 0 - нужно править, мержить нельзя (нарушение соглашений, публичные поля)
* 1 - лучше исправить в рамках этого ДЗ для повышения оценки
* 2 - можно мержить, но в следующих ДЗ нужно поправить.
* 3 - можно мержить, мелкие недочёты
* 4 - отличная работа!
* 5 - экстра балл за особо красивый кусочек кода/решение целиком (ставится только после отличной работы, отдельно не
  ставится)

 
--- 

1. Поднимаем БД

```dockerfile
docker-compose up
```

2. Запускам приложение

http://localhost:8080/

3. Заходим под

| Логин |  пароль |  
admin :  password

</details>


<summary>
Домашнее задание № 13
</summary>

### Ввести авторизацию на основе URL и/или доменных сущностей

#### Цель: научиться защищать приложение с помощью полноценной авторизации и разграничением прав доступа 

#### Результат: полноценное приложение с безопасностью на основе Spring Security



### Описание решения

Требования:


*   Минимум: настроить в приложении авторизацию на уровне URL.
*   Максимум: настроить в приложении авторизацию на основе доменных сущностей и методов сервиса.

#### Рекомендации к выполнению работы:


*    Не рекомендуется выделять пользователей с разными правами в разные классы - т.е. просто один класс пользователя.
*    В случае авторизации на основе доменных сущностей и PostgreSQL не используйте GUID для сущностей.

Данное задание НЕ засчитывает предыдущие!

#### Критерии оценки:

###### Факт сдачи:

* 0 - задание не сдано
* 0 - ничего не работает или отсутствует основной функционал
* 1 - задание сдано Степень выполнения (количество работающего функционала, что примет заказчик, что будет проверять
  тестировщик):
* 1 - не работает или отсутствует большая часть критического функционала
* 2 - основной функционал есть, возможны небольшие косяки
* 3 - основной функционал есть, всё хорошо работает
* 4 - основной функционал есть, всё хорошо работает, тесты и/или задание перевыполнено

###### Способ выполнения (качество выполнения, стиль кода, как ревью перед мержем):

* 0 - нужно править, мержить нельзя (нарушение соглашений, публичные поля)
* 1 - лучше исправить в рамках этого ДЗ для повышения оценки
* 2 - можно мержить, но в следующих ДЗ нужно поправить.
* 3 - можно мержить, мелкие недочёты
* 4 - отличная работа!
* 5 - экстра балл за особо красивый кусочек кода/решение целиком (ставится только после отличной работы, отдельно не
  ставится)

 
--- 

1. Поднимаем БД

```dockerfile
docker-compose up
```

2. Запускам приложение

http://localhost:8080/

3. Заходим под

| Логин |  пароль |   роль|
admin :  password | ADMIN
user : password | USER

Для роли ADMIN даны права на просмотр жанров и авторов

</details>
