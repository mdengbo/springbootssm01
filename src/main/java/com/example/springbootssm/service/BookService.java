package com.example.springbootssm.service;

import com.example.springbootssm.entity.Book;

import java.util.List;

public interface BookService {
    int insert(Book record);

    List<Book> selectAll();
}
