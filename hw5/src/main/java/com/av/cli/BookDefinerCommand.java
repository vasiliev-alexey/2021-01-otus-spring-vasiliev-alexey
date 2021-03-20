package com.av.cli;

import com.av.dao.AuthorDao;
import com.av.dao.BookDao;
import com.av.dao.GenreDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.text.MessageFormat;

@ShellComponent
public class BookDefinerCommand {

    private final AuthorDao authorDao;
    private final GenreDao genreDao;
    private final BookDao bookDao;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public BookDefinerCommand(AuthorDao authorDao, GenreDao genreDao, BookDao bookDao) {
        this.authorDao = authorDao;
        this.genreDao = genreDao;
        this.bookDao = bookDao;
    }

    @ShellMethod("show all books")
    public void listBooks() {
        logger.info("ho ho");
        var books = bookDao.getAll();

        if (books.size() != 0) {
            books.forEach(book -> logger.info(MessageFormat.format("Book:{0}", book.toString())));
        } else {
            logger.debug("No author in db");
        }
    }

    @ShellMethod("show books")
    public void showBooks() {
        logger.info("ho ho");
        var authorList = authorDao.getAll();

        if (authorList.size() != 0) {
            authorDao.getAll().forEach(a -> logger.info(MessageFormat.format("author:{0}", a.toString())));
        } else {
            logger.debug("No author in db");
        }
    }
}
