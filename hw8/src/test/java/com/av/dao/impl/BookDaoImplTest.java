package com.av.dao.impl;

import com.av.dao.BookService;
import com.av.domain.Book;
import com.av.domain.Comment;
import com.av.services.impl.BookServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.context.TestPropertySource;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)

@Import(BookServiceImpl.class)
@Testcontainers
@DataMongoTest(excludeAutoConfiguration = EmbeddedMongoAutoConfiguration.class)
@TestPropertySource(properties = {"spring.config.location=classpath:application-test.yml"})
class BookDaoImplTest {

    @Container
    static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:4.4.2");
    @Autowired
    private BookService bookDao;

    @DynamicPropertySource
    static void setProperties(DynamicPropertyRegistry registry) {
        registry.add("spring.data.mongodb.uri", mongoDBContainer::getReplicaSetUrl);
    }

    @Test
    void saveSimpleBook() {
        var book = new Book();
        book.setIsbn("isbn_dummy");
        book.setTitle("title dummy");
        book.setEdition((short) 1);
        bookDao.save(book);
        assertNotNull(book.getId(), "book nor added");
    }

    @Test
    void saveBookWithComments() {
        var book = new Book();
        book.setIsbn("isbn_dummy");
        book.setTitle("title dummy");
        book.setEdition((short) 1);

        var comment = new Comment();
        comment.setBook(book);
        comment.setUserName("dummy author");
        comment.setText("dummy text");
        book.setComments(Collections.singletonList(comment));

        bookDao.save(book);
        assertNotNull(book.getId(), "book nor added");

        book.getComments().forEach(com -> {
            assertNotNull(com.getId(), "comments not saved");
        });
    }

    @Test
    void delete() {
        var bookCollection = bookDao.findAll();
        assertEquals(1, bookCollection.size(), "book count not expected");
        var book = bookCollection.get(0);
        bookDao.delete(book);
        assertEquals(0, bookDao.findAll().size(), "book count not expected");
    }

    @Test
    void getAll() {
        assertEquals(0, bookDao.findAll().size(), "book count not expected");
        var book = new Book();
        book.setIsbn("isbn_dummy");
        book.setTitle("title dummy");
        book.setEdition((short) 1);
        bookDao.save(book);
        assertEquals(1, bookDao.findAll().size(), "book count not expected");

    }
}
