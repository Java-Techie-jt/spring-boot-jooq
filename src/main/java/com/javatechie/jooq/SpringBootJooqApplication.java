package com.javatechie.jooq;

import com.javatechie.jooq.service.BookService;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/books")
public class SpringBootJooqApplication {

    @Autowired
    private BookService service;

    @PostMapping
    public String addBook(@RequestBody Book book) {
        service.insertBook(book);
        return "book added...";
    }

    @GetMapping
    public List<Book> getBooks() {
        return service.getBooks();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJooqApplication.class, args);
    }

}
