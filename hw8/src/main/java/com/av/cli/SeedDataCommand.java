package com.av.cli;

import com.av.dao.AuthorService;
import com.av.dao.BookService;
import com.av.dao.GenreService;
import com.av.domain.Author;
import com.av.domain.Book;
import com.av.domain.Comment;
import com.av.domain.Genre;
import com.google.common.collect.Sets;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class SeedDataCommand {


    private final BookService bookService;
    private final AuthorService authorDao;
    private final GenreService genreService;

    public SeedDataCommand(BookService bookDao,
                           AuthorService authorService,
                           GenreService genreService) {
        this.bookService = bookDao;
        this.authorDao = authorService;
        this.genreService = genreService;
    }

    @ShellMethod("seed sample data")
    public void seedData(short bookCount) {

        bookService.deleteAll();
        var genres = genreService.findAll();

        if (genres.isEmpty()) {
            var newGenre = new Genre();
            newGenre.setName("fake-genre");
            genreService.save(newGenre);
            genres = genreService.findAll();
        }

        var authors = authorDao.findAll();

        if (authors.size() < 2) {
            authorDao.save(new Author("fake author 1"));
            authorDao.save(new Author("fake author 2"));
            authorDao.save(new Author("fake author 3"));
            authors = authorDao.findAll();
        }

        for (short i = 0; i < bookCount; i++) {

            var newBook = new Book();
            newBook.setTitle(String.format("fake title%d", i));
            newBook.setEdition(i);
            newBook.setIsbn(String.format("fake isbn %s", i));

            var comment = new Comment();
            comment.setText(String.format("fake comment data %d", i));
            comment.setUserName(String.format("fake author comment %d", i));
            comment.setBook(newBook);

            newBook.getComments().add(comment);
            newBook.setGenre(genres.get(0));
            newBook.setAuthors(Sets.newHashSet(authors.subList(1, 2)));

            bookService.save(newBook);

        }


    }


}
