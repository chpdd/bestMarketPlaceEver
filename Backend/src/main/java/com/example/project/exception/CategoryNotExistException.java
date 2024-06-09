package com.example.project.exception;

public class CategoryNotExistException extends Exception{
    public CategoryNotExistException(String message) {
        super(message);
    }
}
