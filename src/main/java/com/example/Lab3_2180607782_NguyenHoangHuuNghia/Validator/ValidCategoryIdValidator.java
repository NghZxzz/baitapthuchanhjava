package com.example.Lab3_2180607782_NguyenHoangHuuNghia.Validator;

import com.example.Lab3_2180607782_NguyenHoangHuuNghia.Validator.annotation.ValidCategoryId;
import com.example.Lab3_2180607782_NguyenHoangHuuNghia.entity.Category;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context){
        return  category != null && category.getId() != null;
    }
}
