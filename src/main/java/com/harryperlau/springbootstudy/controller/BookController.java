package com.harryperlau.springbootstudy.controller;

import com.harryperlau.springbootstudy.config.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired  // 可以利用 Autowired 注入
    private Book book;

    @GetMapping("/bookInfo")
    public String getBookInfo() {
        return "book.Name = " + book.getName() + " book.author = " + book.getAuthor();
    }

}
