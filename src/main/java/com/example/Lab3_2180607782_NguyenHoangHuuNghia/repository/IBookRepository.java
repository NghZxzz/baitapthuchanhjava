package com.example.Lab3_2180607782_NguyenHoangHuuNghia.repository;

import com.example.Lab3_2180607782_NguyenHoangHuuNghia.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends JpaRepository<Book,  Long> {
}
