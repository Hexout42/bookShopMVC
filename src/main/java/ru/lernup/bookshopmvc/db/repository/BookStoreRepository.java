package ru.lernup.bookshopmvc.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lernup.bookshopmvc.db.entity.Book;
import ru.lernup.bookshopmvc.db.entity.BookStore;

import java.util.List;

public interface BookStoreRepository extends JpaRepository<BookStore, Long> {

}