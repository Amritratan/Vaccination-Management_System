package com.example.vaccinationmanagementsystem.Exceptions;

public class EmailIdEmptyException extends Exception{

    //Constructor
    public EmailIdEmptyException(String message){
        super(message);
    }
}