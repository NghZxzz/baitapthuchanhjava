package com.example.Lab3_2180607782_NguyenHoangHuuNghia.Validator;

import com.example.Lab3_2180607782_NguyenHoangHuuNghia.Validator.annotation.VaLidUserId;
import com.example.Lab3_2180607782_NguyenHoangHuuNghia.entity.User;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidUserIdValidator implements ConstraintValidator<VaLidUserId, User> {
    @Override
    public boolean isValid(User user, ConstraintValidatorContext context){
        if(user == null)
            return true;
        return user.getId() != null;
    }
}
