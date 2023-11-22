package com.onlinebookstore.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;
import com.onlinebookstore.entity.Author;

@DataJpaTest
class AuthorRepositoryTest {

    @Autowired
    private AuthorRepository authorRepository;

    @Test
    @Sql({"/schema.sql", "/data.sql"})
    void testFindAll() {
        List<Author> authors = authorRepository.findAll();
        assertNotNull(authors);
        assertFalse(authors.isEmpty());
        assertEquals(2, authors.size());
    }
}