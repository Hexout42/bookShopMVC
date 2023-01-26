package ru.lernup.bookshopmvc.controllers;

import jakarta.websocket.server.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.lernup.bookshopmvc.db.entity.Book;
import ru.lernup.bookshopmvc.db.entity.BookStore;
import ru.lernup.bookshopmvc.db.service.DbService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/stores")
public class BookStoreController {
    private final DbService dbService;

    public BookStoreController(DbService dbService) {
        this.dbService = dbService;
    }

    @GetMapping
    public String getAllStore(Model model){
        List<BookStore> bookStores = dbService.findAllStore();
        model.addAttribute("bookStores",bookStores);
        return "BookStore";
    }
    @GetMapping("/{postId}")
    public String getAllBook(@PathVariable("postId") long postId, Model model,
                             @RequestParam(name = "nameBook",required = false) String name,
                             @RequestParam(name = "cash", required = false) Integer cash){
        List<Book> allBook = dbService.findByNameAndPrice(name,cash,postId);

        model.addAttribute("allBook", allBook);
        return "BookInStore";
    }
}
