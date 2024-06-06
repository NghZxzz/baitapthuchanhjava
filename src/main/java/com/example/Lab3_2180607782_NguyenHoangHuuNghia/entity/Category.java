package com.example.Lab3_2180607782_NguyenHoangHuuNghia.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "catagory")
public class Category {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "category", cascade =  CascadeType.ALL)
    private List<Book> books;
}
