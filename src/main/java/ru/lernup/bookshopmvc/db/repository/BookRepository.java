package ru.lernup.bookshopmvc.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lernup.bookshopmvc.db.entity.Book;
import ru.lernup.bookshopmvc.db.entity.BookStore;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findBooksByNameBookContainsAndPriceBookAndIdStore(String nameBook, int priceBook, BookStore idStore);
}