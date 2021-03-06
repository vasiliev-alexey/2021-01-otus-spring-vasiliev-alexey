package com.av.dao.impl;

import com.av.dao.AuthorService;
import com.av.domain.Author;
import com.av.services.impl.AuthorServiceImpl;
import com.github.cloudyrock.spring.v5.EnableMongock;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.context.TestPropertySource;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Import({AuthorServiceImpl.class})
@Testcontainers
@DataMongoTest(excludeAutoConfiguration = EmbeddedMongoAutoConfiguration.class)
@TestPropertySource(properties = {"spring.config.location=classpath:application-test.yml"})
@EnableMongock
class AuthorDaoImplTest {

    @Container
    static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:4.4.2");


    @Autowired
    private AuthorService authorDao;


    @DynamicPropertySource
    static void setProperties(DynamicPropertyRegistry registry) {
        registry.add("spring.data.mongodb.uri", mongoDBContainer::getReplicaSetUrl);
    }

    @Test
    @DisplayName("author add")
    void add() {
        var author = new Author("fake");
        var a = authorDao.save(author);
        assertNotNull(a.getId(), "author nor added");
    }

    @Test
    void getAll() {
        var author = new Author("fake2");
        var a = authorDao.save(author);
        assertNotNull(a.getId(), "author nor added");
        var authorList = authorDao.findAll();
        assertEquals(3, authorList.size(), "author not fetched");
    }

    @Test
    void findByName() {
        var jonDaw = authorDao.findByName("Jon Daw");

        assertNotNull(jonDaw);
    }

    @Test
    void delete() {
        var test_for_delete = authorDao.findByName("Test for Delete");

        assertNotNull(test_for_delete);
        authorDao.delete(test_for_delete);
    }


}
