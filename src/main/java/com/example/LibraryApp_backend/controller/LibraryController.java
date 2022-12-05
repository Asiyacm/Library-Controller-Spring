package com.example.LibraryApp_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class LibraryController {


    @GetMapping("/")

    public String Adminpage(){

        return("Welcome to Library Adminpage");

    }

    @GetMapping("/userlogin")

    public String UserLoginpage(){

        return("Welcome to Library UserLoginpage");

    }


}
