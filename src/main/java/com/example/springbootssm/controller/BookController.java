package com.example.springbootssm.controller;

import com.example.springbootssm.entity.Book;
import com.example.springbootssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @author madengbo
 * @create 2018-09-17 11:17
 * @desc
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "book")
public class BookController {
    @Autowired
    private BookService bookService;


    @RequestMapping(value = "addUser")
    public int insert(){
        Book book = new Book();
        book.setAuthors("ma");
        book.setBookname("mabook");
        book.setYearPublication(new Date());
        return bookService.insert(book);

    }

    @RequestMapping(value = "getAll")
    public List<Book> getAll(){
        return bookService.selectAll();
    }

}
