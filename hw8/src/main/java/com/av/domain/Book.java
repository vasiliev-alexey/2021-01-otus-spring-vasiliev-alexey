package com.av.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Document
public class Book {

    @Id
    private String id;
    @DBRef
    private Genre genre;
    @DBRef
    private Set<Author> authors;
    private String title;
    private int publishYear;
    private String isbn;
    private short edition = 1;

    private List<Comment> comments;

    public Book() {
        authors = new HashSet<>();
        comments = new ArrayList<>();
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public short getEdition() {
        return edition;
    }

    public void setEdition(short edition) {
        this.edition = edition;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book{"
                + "id=" + id
                + ", genre=" + genre
                + ", authors=" + authors
                + ", title='" + title + '\''
                + ", publishYear=" + publishYear
                + ", isbn='" + isbn + '\''
                + ", edition=" + edition
                + ", comments=" + comments
                + '}';
    }
}
