package com.example.Lab3_2180607782_NguyenHoangHuuNghia.entity;

import com.example.Lab3_2180607782_NguyenHoangHuuNghia.Validator.annotation.VaLidUserId;
import com.example.Lab3_2180607782_NguyenHoangHuuNghia.Validator.annotation.ValidCategoryId;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "book")
@ToString(exclude = "category")
public class Book {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title")
    @NotEmpty(message = "Title must not be empty")
    @Size(max = 50, min = 1, message = "Title must be less than 50 characters")
    private String title;
    @Column(name = "author")
    private String author;
    @Column(name = "price")
    @NotNull(message = "price is required")
    private Double price;
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    @ValidCategoryId
    private Category  category;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @VaLidUserId
    private User  user;
}
