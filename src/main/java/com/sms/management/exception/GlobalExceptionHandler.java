package com.sms.management.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity studentNotFoundException(StudentNotFoundException exception){
        return new ResponseEntity(exception.getMessage(), HttpStatus.NOT_FOUND);
    };
    @ExceptionHandler(CourseNotFoundException.class)
    public ResponseEntity courseNotFoundException(CourseNotFoundException exception){
        return new ResponseEntity(exception.getMessage(), HttpStatus.NOT_FOUND);
    };
}