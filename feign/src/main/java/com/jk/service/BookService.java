package com.jk.service;

import com.jk.service.hystrix.BookServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "provider",fallback = BookServiceHystrix.class)
public interface BookService {

    @RequestMapping("/show")
    public String show();
}
