package com.example.PeEx.shop.controller.booking;

import com.example.PeEx.shop.controller.exception.BookingNotFoundException;
import com.example.PeEx.shop.controller.exception.CategoryNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class BookingNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(BookingNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(BookingNotFoundException ex) {
        return ex.getMessage();
    }
}
