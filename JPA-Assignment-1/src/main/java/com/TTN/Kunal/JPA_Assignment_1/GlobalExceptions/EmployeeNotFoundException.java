package com.TTN.Kunal.JPA_Assignment_1.GlobalExceptions;

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(String message)
    {
        super(message);
    }
}
