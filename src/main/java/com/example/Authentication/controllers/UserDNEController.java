package com.example.Authentication.controllers;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Authentication.entities.User;
import com.example.Authentication.exceptions.UserNotFoundException;

@ControllerAdvice
public class UserDNEController {
	@ExceptionHandler(value = UserNotFoundException.class) 
    public String errorLogin(UserNotFoundException dne){
    	
    	return "deniedAccess";
    	
    }
}
