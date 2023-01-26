package ru.lernup.bookshopmvc.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lernup.bookshopmvc.db.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    Author findAuthorByAllNameAuthor(String name);
}