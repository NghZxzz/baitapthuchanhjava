package com.example.Lab3_2180607782_NguyenHoangHuuNghia.services;

import com.example.Lab3_2180607782_NguyenHoangHuuNghia.entity.CustomUserDetail;
import com.example.Lab3_2180607782_NguyenHoangHuuNghia.entity.User;
import com.example.Lab3_2180607782_NguyenHoangHuuNghia.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private IUserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername (String username) throws UsernameNotFoundException{
        User user = userRepository.findByUsername( username);
        if(user == null)
            throw new UsernameNotFoundException("User not found");
        return new CustomUserDetail(user, userRepository);
    }
}
