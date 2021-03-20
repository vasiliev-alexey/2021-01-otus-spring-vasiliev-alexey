package com.av.cli;

import com.av.dao.AuthorDao;
import com.av.domain.Author;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.text.MessageFormat;

@ShellComponent
public class AuthorDefinerCommand {

    private final AuthorDao authorDao;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public AuthorDefinerCommand(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    @ShellMethod("set locale fo session")
    public void addAuthor(String name) {
        logger.debug(String.format("addAuthor with name:%s", name));
        var author = authorDao.add(new Author(name));
        logger.debug("new AuthorId=" + author.getId());
    }

    @ShellMethod("show authors")
    public void showAuthors() {
        logger.info("ho ho");
        var authorList = authorDao.getAll();

        if (authorList.size() != 0) {
            authorDao.getAll().forEach(a -> logger.info(MessageFormat.format("author:{0}", a.toString())));
        } else {
            logger.debug("No author in db");
        }
    }
}
