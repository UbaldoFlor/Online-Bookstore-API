INSERT INTO genre (name) VALUES
                             ('Programming'),
                             ('Science Fiction'),
                             ('Mystery'),
                             ('Romance'),
                             ('Biography');

INSERT INTO author (name) VALUES
                              ('John Doe'),
                              ('Jane Smith'),
                              ('Bob Johnson'),
                              ('Sarah Lee');

INSERT INTO book (title, author_id, genre_id, price, quantity)
VALUES
    ('Java Programming', 1, 1, 29.99, 10),
    ('Python for Data Science', 2, 1, 34.99, 5),
    ('The Da Vinci Code', 3, 3, 19.99, 15),
    ('The Notebook', 4, 4, 14.99, 20),
    ('Becoming', 5, 5, 24.99, 8);