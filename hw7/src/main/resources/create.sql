create table authors (id  bigserial not null, name varchar(50) not null, primary key (id))
create table authors_books (author_id int8 not null, books_id int8 not null)
create table book (id  bigserial not null, edition int2, isbn varchar(50) not null, publish_year int4, title varchar(255) not null, genre_id int8, primary key (id))
create table book_author_t (book_id int8 not null, author_id int8 not null, primary key (book_id, author_id))
create table genre (id  bigserial not null, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
create table authors (id  bigserial not null, name varchar(50) not null, primary key (id))
create table authors_books (author_id int8 not null, books_id int8 not null)
create table book (id  bigserial not null, edition int2, isbn varchar(50) not null, publish_year int4, title varchar(255) not null, genre_id int8, primary key (id))
create table book_author_t (book_id int8 not null, author_id int8 not null, primary key (book_id, author_id))
create table genre (id  bigserial not null, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
create table authors (id  bigserial not null, name varchar(50) not null, primary key (id))
create table authors_books (author_id int8 not null, books_id int8 not null)
create table book (id  bigserial not null, edition int2, isbn varchar(50) not null, publish_year int4, title varchar(255) not null, genre_id int8, primary key (id))
create table book_author_t (book_id int8 not null, author_id int8 not null, primary key (book_id, author_id))
create table genre (id  bigserial not null, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
create table authors (id  bigserial not null, name varchar(50) not null, primary key (id))
create table authors_books (author_id int8 not null, books_id int8 not null)
create table book (id  bigserial not null, edition int2, isbn varchar(50) not null, publish_year int4, title varchar(255) not null, genre_id int8, primary key (id))
create table book_author_t (book_id int8 not null, author_id int8 not null, primary key (book_id, author_id))
create table genre (id  bigserial not null, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
create table authors (id  bigserial not null, name varchar(50) not null, primary key (id))
create table authors_books (author_id int8 not null, books_id int8 not null)
create table book (id  bigserial not null, edition int2, isbn varchar(50) not null, publish_year int4, title varchar(255) not null, genre_id int8, primary key (id))
create table book_author_t (book_id int8 not null, author_id int8 not null, primary key (book_id, author_id))
create table genre (id  bigserial not null, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
create table authors (id  bigserial not null, name varchar(50) not null, primary key (id))
create table authors_books (author_id int8 not null, books_id int8 not null)
create table book (id  bigserial not null, edition int2, isbn varchar(50) not null, publish_year int4, title varchar(255) not null, genre_id int8, primary key (id))
create table book_author_t (book_id int8 not null, author_id int8 not null, primary key (book_id, author_id))
create table genre (id  bigserial not null, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
create table authors (id  bigserial not null, name varchar(50) not null, primary key (id))
create table authors_books (author_id int8 not null, books_id int8 not null)
create table book (id  bigserial not null, edition int2, isbn varchar(50) not null, publish_year int4, title varchar(255) not null, genre_id int8, primary key (id))
create table book_author_t (book_id int8 not null, author_id int8 not null, primary key (book_id, author_id))
create table genre (id  bigserial not null, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
create table authors (id  bigserial not null, name varchar(50) not null, primary key (id))
create table authors_books (author_id int8 not null, books_id int8 not null)
create table book (id  bigserial not null, edition int2, isbn varchar(50) not null, publish_year int4, title varchar(255) not null, genre_id int8, primary key (id))
create table book_author_t (book_id int8 not null, author_id int8 not null, primary key (book_id, author_id))
create table genre (id  bigserial not null, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
create table authors (id  bigserial not null, name varchar(50) not null, primary key (id))
create table authors_books (author_id int8 not null, books_id int8 not null)
create table book (id  bigserial not null, edition int2, isbn varchar(50) not null, publish_year int4, title varchar(255) not null, genre_id int8, primary key (id))
create table book_author_t (book_id int8 not null, author_id int8 not null, primary key (book_id, author_id))
create table genre (id  bigserial not null, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
create table authors (id  bigserial not null, name varchar(50) not null, primary key (id))
create table authors_books (author_id int8 not null, books_id int8 not null)
create table book (id  bigserial not null, edition int2, isbn varchar(50) not null, publish_year int4, title varchar(255) not null, genre_id int8, primary key (id))
create table book_author_t (book_id int8 not null, author_id int8 not null, primary key (book_id, author_id))
create table genre (id  bigserial not null, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
create table authors (id  bigserial not null, name varchar(50) not null, primary key (id))
create table authors_books (author_id int8 not null, books_id int8 not null)
create table book (id  bigserial not null, edition int2, isbn varchar(50) not null, publish_year int4, title varchar(255) not null, genre_id int8, primary key (id))
create table book_author_t (book_id int8 not null, author_id int8 not null, primary key (book_id, author_id))
create table genre (id  bigserial not null, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
create table authors (id  bigserial not null, name varchar(50) not null, primary key (id))
create table authors_books (author_id int8 not null, books_id int8 not null)
create table book (id  bigserial not null, edition int2, isbn varchar(50) not null, publish_year int4, title varchar(255) not null, genre_id int8, primary key (id))
create table book_author_t (book_id int8 not null, author_id int8 not null, primary key (book_id, author_id))
create table genre (id  bigserial not null, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
create table authors (id  bigserial not null, name varchar(50) not null, primary key (id))
create table authors_books (author_id int8 not null, books_id int8 not null)
create table book (id  bigserial not null, edition int2, isbn varchar(50) not null, publish_year int4, title varchar(255) not null, genre_id int8, primary key (id))
create table book_author_t (book_id int8 not null, author_id int8 not null, primary key (book_id, author_id))
create table genre (id  bigserial not null, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
create table authors (id  bigserial not null, name varchar(50) not null, primary key (id))
create table authors_books (author_id int8 not null, books_id int8 not null)
create table book (id  bigserial not null, edition int2, isbn varchar(50) not null, publish_year int4, title varchar(255) not null, genre_id int8, primary key (id))
create table book_author_t (book_id int8 not null, author_id int8 not null, primary key (book_id, author_id))
create table genre (id  bigserial not null, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
create table authors (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
create table authors_books (author_id bigint not null, books_id bigint not null)
create table book (id bigint generated by default as identity, edition smallint, isbn varchar(50) not null, publish_year integer, title varchar(255) not null, genre_id bigint, primary key (id))
create table book_author_t (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id))
create table genre (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
create table authors (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
create table authors_books (author_id bigint not null, books_id bigint not null)
create table book (id bigint generated by default as identity, edition smallint, isbn varchar(50) not null, publish_year integer, title varchar(255) not null, genre_id bigint, primary key (id))
create table book_author_t (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id))
create table genre (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
create table authors (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
create table authors_books (author_id bigint not null, books_id bigint not null)
create table book (id bigint generated by default as identity, edition smallint, isbn varchar(50) not null, publish_year integer, title varchar(255) not null, genre_id bigint, primary key (id))
create table book_author_t (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id))
create table genre (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
create table authors (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
create table authors_books (author_id bigint not null, books_id bigint not null)
create table book (id bigint generated by default as identity, edition smallint, isbn varchar(50) not null, publish_year integer, title varchar(255) not null, genre_id bigint, primary key (id))
create table book_author_t (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id))
create table genre (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
create table authors (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
create table authors_books (author_id bigint not null, books_id bigint not null)
create table book (id bigint generated by default as identity, edition smallint, isbn varchar(50) not null, publish_year integer, title varchar(255) not null, genre_id bigint, primary key (id))
create table book_author_t (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id))
create table genre (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
create table authors (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
create table authors_books (author_id bigint not null, books_id bigint not null)
create table book (id bigint generated by default as identity, edition smallint, isbn varchar(50) not null, publish_year integer, title varchar(255) not null, genre_id bigint, primary key (id))
create table book_author_t (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id))
create table genre (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
create table authors (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
create table authors_books (author_id bigint not null, books_id bigint not null)
create table book (id bigint generated by default as identity, edition smallint, isbn varchar(50) not null, publish_year integer, title varchar(255) not null, genre_id bigint, primary key (id))
create table book_author_t (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id))
create table genre (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
create table authors (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
create table authors_books (author_id bigint not null, books_id bigint not null)
create table book (id bigint generated by default as identity, edition smallint, isbn varchar(50) not null, publish_year integer, title varchar(255) not null, genre_id bigint, primary key (id))
create table book_author_t (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id))
create table genre (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
create table authors (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
create table authors_books (author_id bigint not null, books_id bigint not null)
create table book (id bigint generated by default as identity, edition smallint, isbn varchar(50) not null, publish_year integer, title varchar(255) not null, genre_id bigint, primary key (id))
create table book_author_t (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id))
create table comments (id bigint generated by default as identity, comment_data varchar(1000) not null, user_name varchar(50) not null, book_id bigint, primary key (id))
create table genre (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
alter table comments add constraint book_fk foreign key (book_id) references book
create table authors (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
create table authors_books (author_id bigint not null, books_id bigint not null)
create table book (id bigint generated by default as identity, edition smallint, isbn varchar(50) not null, publish_year integer, title varchar(255) not null, genre_id bigint, primary key (id))
create table book_author_t (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id))
create table comments (id bigint generated by default as identity, comment_data varchar(1000) not null, user_name varchar(50) not null, book_id bigint, primary key (id))
create table genre (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
alter table comments add constraint book_fk foreign key (book_id) references book
create table authors (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
create table authors_books (author_id bigint not null, books_id bigint not null)
create table book (id bigint generated by default as identity, edition smallint, isbn varchar(50) not null, publish_year integer, title varchar(255) not null, genre_id bigint, primary key (id))
create table book_author_t (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id))
create table comments (id bigint generated by default as identity, comment_data varchar(1000) not null, user_name varchar(50) not null, book_id bigint, primary key (id))
create table genre (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
alter table comments add constraint book_fk foreign key (book_id) references book
create table authors (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
create table authors_books (author_id bigint not null, books_id bigint not null)
create table book (id bigint generated by default as identity, edition smallint, isbn varchar(50) not null, publish_year integer, title varchar(255) not null, genre_id bigint, primary key (id))
create table book_author_t (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id))
create table comments (id bigint generated by default as identity, comment_data varchar(1000) not null, user_name varchar(50) not null, book_id bigint, primary key (id))
create table genre (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
alter table comments add constraint book_fk foreign key (book_id) references book
create table authors (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
create table authors_books (author_id bigint not null, books_id bigint not null)
create table book (id bigint generated by default as identity, edition smallint, isbn varchar(50) not null, publish_year integer, title varchar(255) not null, genre_id bigint, primary key (id))
create table book_author_t (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id))
create table comments (id bigint generated by default as identity, comment_data varchar(1000) not null, user_name varchar(50) not null, book_id bigint, primary key (id))
create table genre (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
alter table comments add constraint book_fk foreign key (book_id) references book
create table authors (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
create table authors_books (author_id bigint not null, books_id bigint not null)
create table book (id bigint generated by default as identity, edition smallint, isbn varchar(50) not null, publish_year integer, title varchar(255) not null, genre_id bigint, primary key (id))
create table book_author_t (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id))
create table comments (id bigint generated by default as identity, comment_data varchar(1000) not null, user_name varchar(50) not null, book_id bigint, primary key (id))
create table genre (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
alter table comments add constraint book_fk foreign key (book_id) references book
create table authors (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
create table authors_books (author_id bigint not null, books_id bigint not null)
create table book (id bigint generated by default as identity, edition smallint, isbn varchar(50) not null, publish_year integer, title varchar(255) not null, genre_id bigint, primary key (id))
create table book_author_t (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id))
create table comments (id bigint generated by default as identity, comment_data varchar(1000) not null, user_name varchar(50) not null, book_id bigint, primary key (id))
create table genre (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
alter table comments add constraint book_fk foreign key (book_id) references book
create table authors (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
create table authors_books (author_id bigint not null, books_id bigint not null)
create table book (id bigint generated by default as identity, edition smallint, isbn varchar(50) not null, publish_year integer, title varchar(255) not null, genre_id bigint, primary key (id))
create table book_author_t (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id))
create table comments (id bigint generated by default as identity, comment_data varchar(1000) not null, user_name varchar(50) not null, book_id bigint, primary key (id))
create table genre (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
alter table comments add constraint book_fk foreign key (book_id) references book
create table authors (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
create table authors_books (author_id bigint not null, books_id bigint not null)
create table book (id bigint generated by default as identity, edition smallint, isbn varchar(50) not null, publish_year integer, title varchar(255) not null, genre_id bigint, primary key (id))
create table book_author_t (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id))
create table comments (id bigint generated by default as identity, comment_data varchar(1000) not null, user_name varchar(50) not null, book_id bigint, primary key (id))
create table genre (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
alter table comments add constraint book_fk foreign key (book_id) references book
create table authors (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
create table authors_books (author_id bigint not null, books_id bigint not null)
create table book (id bigint generated by default as identity, edition smallint, isbn varchar(50) not null, publish_year integer, title varchar(255) not null, genre_id bigint, primary key (id))
create table book_author_t (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id))
create table comments (id bigint generated by default as identity, comment_data varchar(1000) not null, user_name varchar(50) not null, book_id bigint, primary key (id))
create table genre (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
alter table comments add constraint book_fk foreign key (book_id) references book
create table authors (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
create table authors_books (author_id bigint not null, books_id bigint not null)
create table book (id bigint generated by default as identity, edition smallint, isbn varchar(50) not null, publish_year integer, title varchar(255) not null, genre_id bigint, primary key (id))
create table book_author_t (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id))
create table comments (id bigint generated by default as identity, comment_data varchar(1000) not null, user_name varchar(50) not null, book_id bigint, primary key (id))
create table genre (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
alter table comments add constraint book_fk foreign key (book_id) references book
create table authors (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
create table authors_books (author_id bigint not null, books_id bigint not null)
create table book (id bigint generated by default as identity, edition smallint, isbn varchar(50) not null, publish_year integer, title varchar(255) not null, genre_id bigint, primary key (id))
create table book_author_t (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id))
create table comments (id bigint generated by default as identity, comment_data varchar(1000) not null, user_name varchar(50) not null, book_id bigint, primary key (id))
create table genre (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
alter table comments add constraint book_fk foreign key (book_id) references book
create table authors (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
create table authors_books (author_id bigint not null, books_id bigint not null)
create table book (id bigint generated by default as identity, edition smallint, isbn varchar(50) not null, publish_year integer, title varchar(255) not null, genre_id bigint, primary key (id))
create table book_author_t (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id))
create table comments (id bigint generated by default as identity, comment_data varchar(1000) not null, user_name varchar(50) not null, book_id bigint, primary key (id))
create table genre (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
alter table comments add constraint book_fk foreign key (book_id) references book
create table authors (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
create table authors_books (author_id bigint not null, books_id bigint not null)
create table book (id bigint generated by default as identity, edition smallint, isbn varchar(50) not null, publish_year integer, title varchar(255) not null, genre_id bigint, primary key (id))
create table book_author_t (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id))
create table comments (id bigint generated by default as identity, comment_data varchar(1000) not null, user_name varchar(50) not null, book_id bigint, primary key (id))
create table genre (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
alter table comments add constraint book_fk foreign key (book_id) references book
create table authors (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
create table authors_books (author_id bigint not null, books_id bigint not null)
create table book (id bigint generated by default as identity, edition smallint, isbn varchar(50) not null, publish_year integer, title varchar(255) not null, genre_id bigint, primary key (id))
create table book_author_t (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id))
create table comments (id bigint generated by default as identity, comment_data varchar(1000) not null, user_name varchar(50) not null, book_id bigint, primary key (id))
create table genre (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
alter table comments add constraint book_fk foreign key (book_id) references book
create table authors (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
create table authors_books (author_id bigint not null, books_id bigint not null)
create table book (id bigint generated by default as identity, edition smallint, isbn varchar(50) not null, publish_year integer, title varchar(255) not null, genre_id bigint, primary key (id))
create table book_author_t (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id))
create table comments (id bigint generated by default as identity, comment_data varchar(1000) not null, user_name varchar(50) not null, book_id bigint, primary key (id))
create table genre (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
alter table comments add constraint book_fk foreign key (book_id) references book
create table authors (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
create table authors_books (author_id bigint not null, books_id bigint not null)
create table book (id bigint generated by default as identity, edition smallint, isbn varchar(50) not null, publish_year integer, title varchar(255) not null, genre_id bigint, primary key (id))
create table book_author_t (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id))
create table comments (id bigint generated by default as identity, comment_data varchar(1000) not null, user_name varchar(50) not null, book_id bigint, primary key (id))
create table genre (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
alter table comments add constraint book_fk foreign key (book_id) references book
create table authors (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
create table authors_books (author_id bigint not null, books_id bigint not null)
create table book (id bigint generated by default as identity, edition smallint, isbn varchar(50) not null, publish_year integer, title varchar(255) not null, genre_id bigint, primary key (id))
create table book_author_t (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id))
create table comments (id bigint generated by default as identity, comment_data varchar(1000) not null, user_name varchar(50) not null, book_id bigint, primary key (id))
create table genre (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
alter table comments add constraint book_fk foreign key (book_id) references book
create table authors (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
create table authors_books (author_id bigint not null, books_id bigint not null)
create table book (id bigint generated by default as identity, edition smallint, isbn varchar(50) not null, publish_year integer, title varchar(255) not null, genre_id bigint, primary key (id))
create table book_author_t (book_id bigint not null, author_id bigint not null, primary key (book_id, author_id))
create table comments (id bigint generated by default as identity, comment_data varchar(1000) not null, user_name varchar(50) not null, book_id bigint, primary key (id))
create table genre (id bigint generated by default as identity, name varchar(50) not null, primary key (id))
alter table book add constraint book_title_edition_u1 unique (title, edition)
alter table authors_books add constraint FKcqtajlg68afim1lilbub4c0u6 foreign key (books_id) references book
alter table authors_books add constraint book_fk foreign key (author_id) references authors
alter table book add constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre
alter table book_author_t add constraint FKbrjjrduklf3cn6dxotpnnb1h0 foreign key (author_id) references authors
alter table book_author_t add constraint book_author_key foreign key (book_id) references book
alter table comments add constraint book_fk foreign key (book_id) references book
