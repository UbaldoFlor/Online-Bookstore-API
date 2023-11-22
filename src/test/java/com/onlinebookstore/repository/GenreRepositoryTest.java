package com.onlinebookstore.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;
import com.onlinebookstore.entity.Genre;
@DataJpaTest
class GenreRepositoryTest {

    @Autowired
    private GenreRepository genreRepository;

    @Test
    @Sql({"/schema.sql", "/data.sql"})
    void testFindAll() {
        List<Genre> genres = genreRepository.findAll();
        assertNotNull(genres);
        assertFalse(genres.isEmpty());
        assertEquals(2, genres.size());
    }
}