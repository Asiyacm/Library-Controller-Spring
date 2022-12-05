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


    @GetMapping("/usersignup")

    public String UserSignuppage(){

        return("Welcome to Library User Signup page");

    }

    @GetMapping("/add")

    public String bookAdd(){

        return("Welcome to Library Book Adding page");

    }

    @GetMapping("/view")

    public String bookView(){

        return("Welcome to Library Book View page");

    }


    @GetMapping("/issue")

    public String bookIssue(){

        return("Welcome to Library Book Issue page");

    }


    @GetMapping("/search")

    public String bookSearch(){

        return("Welcome to Library Book Search page");

    }

    @GetMapping("/edit")

    public String bookEdit(){

        return("Welcome to Library Book Edit page");

    }


    @GetMapping("/delete")

    public String bookDelete(){

        return("Welcome to Library Book Delete page");

    }
}
