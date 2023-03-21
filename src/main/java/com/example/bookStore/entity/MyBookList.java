package com.example.bookStore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@ToString
@Table(name = "my_book_list")
public class MyBookList {
    @Id
    private int id;
    private String name;
    private String author;
    private String price;
}
