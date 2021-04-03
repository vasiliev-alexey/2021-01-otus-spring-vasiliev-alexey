package com.av.cli;

import com.av.dao.AuthorService;
import com.av.dao.BookService;
import com.av.dao.GenreService;
import com.av.domain.Book;
import com.av.domain.Comment;
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
            newBook.setGenre(genres.get(1));
            newBook.setAuthors(Sets.newHashSet(authorDao.findAll().subList(1, 2)));

            bookService.save(newBook);

        }


    }


}
