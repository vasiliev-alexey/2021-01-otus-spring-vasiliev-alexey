package com.av.cli;

import com.av.dao.AuthorService;
import com.av.dao.BookService;
import com.av.dao.GenreService;
import com.av.domain.Book;
import com.av.domain.Comment;
import com.google.common.collect.Sets;
import org.bson.types.ObjectId;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.util.Random;

@ShellComponent
public class SeedDataCommand {


    private final BookService bookService;
    private final AuthorService authorDao;
    private final GenreService genreService;
    private static final short RANDOM_GENERATE = 3;


    public SeedDataCommand(BookService bookDao,
                           AuthorService authorService,
                           GenreService genreService) {
        this.bookService = bookDao;
        this.authorDao = authorService;
        this.genreService = genreService;
    }

    private int getRandomNumberUsingInts(int max) {
        Random random = new Random();
        return Math.max(random.ints(0, max)
                .findFirst()
                .getAsInt(), 1);
    }

    @ShellMethod("seed sample data")
    public void seedData(short bookCount) {

        bookService.deleteAll();
        var genres = genreService.findAll();
        var authors = authorDao.findAll();

        for (short i = 0; i < bookCount; i++) {

            var newBook = new Book();
            newBook.setTitle(String.format("fake title%d", i));
            newBook.setEdition(i);
            newBook.setIsbn(String.format("fake isbn %s", i));


            if (i % RANDOM_GENERATE == 0) {
                for (int c = 0; c < RANDOM_GENERATE; c++) {
                    var comment = new Comment();
                    comment.setText(String.format("fake comment data %d %d ", c, i));
                    comment.setUserName(String.format("fake author comment %d  %d", c, i));
                    newBook.getComments().add(comment);
                }
            }

            newBook.setGenre(genres.get(getRandomNumberUsingInts(genres.size())));
            newBook.setAuthors(Sets.newHashSet(authors.subList(0, getRandomNumberUsingInts(authors.size()))));
            newBook.setId(String.valueOf(ObjectId.get()));

            bookService.save(newBook);

        }


    }


}
