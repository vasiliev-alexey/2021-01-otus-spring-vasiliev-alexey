# Проект

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

\*Опционально:

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
