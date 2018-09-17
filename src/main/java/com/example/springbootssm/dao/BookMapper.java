package com.example.springbootssm.dao;

import com.example.springbootssm.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper
@Repository
public interface BookMapper {
    int insert(Book record);

    List<Book> selectAll();
}