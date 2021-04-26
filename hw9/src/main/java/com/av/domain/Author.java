package com.av.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;


@Table(name = "authors")
@Entity
public class Author {

    public static final String FIND_ALL = "Author.findAll";
    public static final String FIND_BY_NAME = "Author.byName";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", length = 50, nullable = false)
    private String name;
    @ManyToMany(targetEntity = Book.class)
    @JoinColumn(foreignKey = @ForeignKey(name = "book_fk"))
    private List<Book> books;

    public Author() {

    }

    public Author(String name) {
        this();
        this.name = name;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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


    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
