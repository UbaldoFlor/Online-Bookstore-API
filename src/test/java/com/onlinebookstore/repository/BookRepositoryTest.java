package com.onlinebookstore.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;
import com.onlinebookstore.entity.Book;

@DataJpaTest
class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    @Sql({"/schema.sql", "/data.sql"})
    void testFindAll() {
        List<Book> books = bookRepository.findAll();
        assertNotNull(books);
        assertFalse(books.isEmpty());
        assertEquals(2, books.size());
    }
}