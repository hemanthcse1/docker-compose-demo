package com.hemanth.dockercomposedemo.controller;

import com.hemanth.dockercomposedemo.entity.Book;
import com.hemanth.dockercomposedemo.repository.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {



    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping
    public Book saveBook(@RequestBody Book book){
        return bookRepository.save(book);
    }


    @GetMapping
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
}
