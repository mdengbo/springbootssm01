package com.example.springbootssm.service.impl;

import com.example.springbootssm.dao.BookMapper;
import com.example.springbootssm.entity.Book;
import com.example.springbootssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author madengbo
 * @create 2018-09-17 11:11
 * @desc
 * @Version 1.0
 **/
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public int insert(Book record) {
        return bookMapper.insert(record);
    }

    @Override
    public List<Book> selectAll() {
        return bookMapper.selectAll();
    }
}
