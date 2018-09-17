package com.example.springbootssm.entity;

import java.util.Date;

public class Book {
    private Integer bookid;

    private String bookname;

    private String authors;

    private String info;

    private String comment;

    private Date yearPublication;

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(Date yearPublication) {
        this.yearPublication = yearPublication;
    }
}