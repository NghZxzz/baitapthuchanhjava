package com.example.Lab3_2180607782_NguyenHoangHuuNghia.repository;

import com.example.Lab3_2180607782_NguyenHoangHuuNghia.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {
}
