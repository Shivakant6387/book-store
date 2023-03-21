package com.example.bookStore.service;

import com.example.bookStore.entity.MyBookList;
import com.example.bookStore.repository.MyBookListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookListService  {
    @Autowired
    private MyBookListRepository myBookListRepository;
     public void saveMyBookList(MyBookList myBookList){
         myBookListRepository.save(myBookList);
     }
     public List<MyBookList> getAllMyBooks(){
         return myBookListRepository.findAll();
     }
     public void deleteById(int id){
         myBookListRepository.deleteById(id);
     }
}
