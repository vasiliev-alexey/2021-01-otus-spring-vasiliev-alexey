### Переписать приложение Библиотека на Spring Data JPA

#### Цель: максимально просто писать слой репозиториев с применением современных подходов

#### Результат: приложение со слоем репозиториев на Spring Data JPA

<details>
<summary>Требования и постановка
</summary>

### Описание решения

Требования:

* Переписать все репозитории по работе с книгами на Spring Data JPA репозитории.
* Используйте spring-boot-starter-data-jpa.
* Кастомные методы репозиториев (или с хитрым @Query) покрыть тестами, используя H2.
* @Transactional рекомендуется ставить на методы сервисов, а не репозиториев.

#### Рекомендации к выполнению работы:

* Это домашнее задание будет использоваться в качестве основы для других ДЗ Данная работа не засчитывает предыдущую!
* Это домашнее задание является основой для следующих.

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

</details>
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