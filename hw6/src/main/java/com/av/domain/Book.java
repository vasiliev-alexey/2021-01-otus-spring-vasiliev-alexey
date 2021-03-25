package com.av.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "books",  uniqueConstraints = {@UniqueConstraint(columnNames = {"title", "edition"}, name = "book_title_edition_u1")})

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(targetEntity = Genre.class, fetch = FetchType.EAGER)
    private Genre genre;

    @ManyToMany(targetEntity = Author.class, fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    @JoinColumn(foreignKey=@ForeignKey(name="book_author_key"))
    private Set<Author> authors;
    @Column(name =  "title", length = 255, nullable = false)
    private String title;
    @Column (name = "publish_year", nullable = true)
    private int publishYear;
    @Column(name =  "isbn", length = 50, nullable = false)
    private String isbn;
    @Column (name = "edition" , length = 1)
    private short edition =1;

    public Book() {
        authors = new HashSet<Author>();
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return (
            "Book{" +
            "id=" +
            id +
            ", genre=" +
            genre.toString() +
            ", authors=" +
            authors.toString() +
            ", title='" +
            title +
            '\'' +
            ", publishYear=" +
            publishYear +
            ", isbn='" +
            isbn +
            '\'' +
            ", edition=" +
            edition +
            '}'
        );
    }
}
