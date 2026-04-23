-- This file initializes the database on start
INSERT INTO books (id, title, author, price) VALUES (nextval('hibernate_sequence'), 'Initial Book', 'Author Name', 10.0);
