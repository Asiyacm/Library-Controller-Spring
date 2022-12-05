package com.example.LibraryApp_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class LibraryController {


    @PostMapping("/")

    public String Adminpage(){

        return("Welcome to Library Adminpage");

    }

    @PostMapping("/userlogin")

    public String UserLoginpage(){

        return("Welcome to Library UserLoginpage");

    }


    @PostMapping("/usersignup")

    public String UserSignuppage(){

        return("Welcome to Library User Signup page");

    }

    @PostMapping("/add")

    public String bookAdd(){

        return("Welcome to Library Book Adding page");

    }

    @GetMapping("/view")

    public String bookView(){

        return("Welcome to Library Book View page");

    }


    @PostMapping("/issue")

    public String bookIssue(){

        return("Welcome to Library Book Issue page");

    }


    @PostMapping("/search")

    public String bookSearch(){

        return("Welcome to Library Book Search page");

    }

    @PostMapping("/edit")

    public String bookEdit(){

        return("Welcome to Library Book Edit page");

    }


    @PostMapping("/delete")

    public String bookDelete(){

        return("Welcome to Library Book Delete page");

    }
}
