package ru.lernup.bookshopmvc.db.service;

import org.springframework.stereotype.Service;

import ru.lernup.bookshopmvc.db.entity.Book;
import ru.lernup.bookshopmvc.db.entity.BookStore;
import ru.lernup.bookshopmvc.db.repository.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class DbService {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final BookStoreRepository bookStoreRepository;
    private final ConsumerRepository consumerRepository;
    private final EmployeeRepository employeeRepository;
    private  final  OrderConsumerRepository orderConsumerRepository;

    public DbService(AuthorRepository authorRepository,
                     BookRepository bookRepository,
                     BookStoreRepository bookStoreRepository,
                     ConsumerRepository consumerRepository,
                     EmployeeRepository employeeRepository,
                     OrderConsumerRepository orderConsumerRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.bookStoreRepository = bookStoreRepository;
        this.consumerRepository = consumerRepository;
        this.employeeRepository = employeeRepository;
        this.orderConsumerRepository = orderConsumerRepository;
    }
    public List<BookStore> findAllStore(){
        return bookStoreRepository.findAll();
    }
    public BookStore findById(Long id){
        return bookStoreRepository.getReferenceById(id);
    }
    public List<Book> findByNameAndPrice(String name,Integer price,Long id){
        List<Book> allBook = new ArrayList<>();
        if (name!=null && price !=null){

             return bookRepository.findBooksByNameBookContainsAndPriceBookAndIdStore(name,price,
                     bookStoreRepository.getReferenceById(id));
        }
        else {
           return bookStoreRepository.getReferenceById(id).getBookList();
        }
    }

}
