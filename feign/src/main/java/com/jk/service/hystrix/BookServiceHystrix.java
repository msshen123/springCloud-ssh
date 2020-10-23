package com.jk.service.hystrix;

import com.jk.service.BookService;
import org.springframework.stereotype.Component;

@Component
public class BookServiceHystrix implements BookService {

    @Override
    public String show() {
        return "网络出现问题";
    }
}
