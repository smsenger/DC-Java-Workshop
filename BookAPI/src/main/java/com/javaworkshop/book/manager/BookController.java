package com.javaworkshop.book.manager;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    //dependency injection next 5 lines, just passing stuff in, whenever we create a new controller, create a new repo
    //inversion of control - inside of class doing a thing. class doesn't care how, just does the thing (eg: email)
    //put in def broadstrokes, just use it when needed
    private BookRepository repository;

    public BookController(BookRepository repository) {
        this.repository = repository;
    }


    //arraylist is an implementation of a list, list is a more generic arraylist, an interface
    @GetMapping("/books")
    public List<Book> getAll() {
        return repository.findAll();
    }

    @GetMapping("/book/{id}")
    public Book findOne(@PathVariable Long id) {
        return repository.findById(id).orElseThrow();
    }

    @PostMapping("/books")
    public Book create(@RequestBody Book book) {

        //save the book and return it back with the id that says that book is saved
        return repository.save(book);
    }
}
