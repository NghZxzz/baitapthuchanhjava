package com.example.Lab3_2180607782_NguyenHoangHuuNghia.Validator;

import com.example.Lab3_2180607782_NguyenHoangHuuNghia.Validator.annotation.ValidUsername;
import com.example.Lab3_2180607782_NguyenHoangHuuNghia.repository.IUserRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidUsernameValidator  implements ConstraintValidator<ValidUsername, String> {
    @Autowired
    private IUserRepository userRepository;
    @Override
    public boolean isValid(String username, ConstraintValidatorContext context)
    {
        if(userRepository == null)
            return true;
        return  userRepository.findByUsername(username) == null;
    }
}
