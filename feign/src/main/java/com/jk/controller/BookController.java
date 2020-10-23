package com.jk.controller;

import com.jk.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/show")
    public String show(){

        return  bookService.show();
    }

}
