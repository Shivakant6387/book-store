package com.example.bookStore.controller;

import com.example.bookStore.service.MyBookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookListController {

    @Autowired
    MyBookListService myBookListService;
    @RequestMapping("/deleteMyList/{id}")
    public String deleteMyList(@PathVariable int id){
        myBookListService.deleteById(id);
        return "redirect:/my_books";
    }
}
