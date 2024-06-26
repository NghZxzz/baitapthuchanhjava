package com.example.Lab3_2180607782_NguyenHoangHuuNghia;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/error")
public class CustomErrorController {
    @GetMapping
    public String handleError(HttpServletRequest request){
        return Optional.ofNullable(request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE)).filter(status -> Integer.parseInt(status.toString()) == 404)
                .map(status->"error/404")
                .orElse(null);
    }
}
