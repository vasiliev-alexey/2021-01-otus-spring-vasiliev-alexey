package com.av.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.Column;
import javax.persistence.ForeignKey;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "book", uniqueConstraints =
        {@UniqueConstraint(columnNames = {"title", "edition"}, name = "book_title_edition_u1")})

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(targetEntity = Genre.class, fetch = FetchType.EAGER)
    private Genre genre;

    @ManyToMany(targetEntity = Author.class, fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    @JoinTable(name = "book_author_t", joinColumns = @JoinColumn(foreignKey = @ForeignKey(name = "book_author_key"),
            name = "book_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
    private List<Author> authors;
    @Column(name = "title", length = 255, nullable = false)
    private String title;
    @Column(name = "publish_year", nullable = true)
    private int publishYear;
    @Column(name = "isbn", length = 50, nullable = false)
    private String isbn;
    @Column(name = "edition", length = 1)
    private short edition = 1;

    @OneToMany(
            orphanRemoval = true, cascade = CascadeType.PERSIST, mappedBy = "book")
    private List<Comment> comments = new ArrayList<Comment>();

    public Book() {
        authors = new ArrayList<Author>();
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

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
