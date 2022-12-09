package com.example.LibraryApp_backend.controller;


import com.example.LibraryApp_backend.Model.Library;
import com.example.LibraryApp_backend.dao.LibraryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController


public class LibraryController {

@CrossOrigin(origins = "*")
    @PostMapping("/")

    public String Adminpage(){

        return("Welcome to Library Adminpage");

    }
    @CrossOrigin(origins = "*")
    @PostMapping("/userlogin")

    public String UserLoginpage(){

        return("Welcome to Library UserLoginpage");

    }

    @CrossOrigin(origins = "*")
    @PostMapping("/usersignup")

    public String UserSignuppage(){

        return("Welcome to Library User Signup page");

    }

@Autowired
private LibraryDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")

    public HashMap<String,String> bookAdd(@RequestBody Library l){
        System.out.println(l.getTitle().toString());
        dao.save(l);
        HashMap<String,String> map= new HashMap<>();
        map.put("status","success");
        return map;

    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")

    public List<Library> bookView(){
        return(List<Library>) dao.findAll();

    }

    @CrossOrigin(origins = "*")
    @PostMapping("/issue")

    public String bookIssue(){

        return("Welcome to Library Book Issue page");

    }

    @CrossOrigin(origins = "*")
    @PostMapping(path="/search",consumes = "application/json",produces = "application/json")
    public List<Library>  bookSearch(@RequestBody Library l){
        String title= l.getTitle();
        System.out.println(title);
        return(List<Library>) dao.searchBook(l.getTitle());

    }
    @CrossOrigin(origins = "*")
    @PostMapping("/edit")

    public String bookEdit(){

        return("Welcome to Library Book Edit page");

    }

    @CrossOrigin(origins = "*")
    @PostMapping("/delete")

    public String bookDelete(){

        return("Welcome to Library Book Delete page");

    }
}
