package com.av.domain;

import jdk.jfr.Enabled;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Table (name = "authors")
@Entity
public class Author {

    private long id;
    private String name;

    private List<Book> books;

    public Author(long id, String name) {
        this.name = name;
        this.id = id;
    }
    public Author() {

    }
    public Author(String name) {

        this();
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "name", length = 50, nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Author{id=%d, name='%s'}", id, name);
    }


    @ManyToMany(targetEntity = Book.class)
    @JoinColumn(foreignKey=@ForeignKey(name="book_fk"))
    public List<Book> getBooks() {
        return books;
    }

      public void setBooks(List<Book> books) {
        this.books = books;
    }
}
