package com.example.LibraryApp_backend.controller;


import com.example.LibraryApp_backend.Model.Library;
import com.example.LibraryApp_backend.Model.UserRegister;
import com.example.LibraryApp_backend.dao.LibraryDao;
import com.example.LibraryApp_backend.dao.UserRegisterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController


public class LibraryController {

    @Autowired
    private LibraryDao dao;

    @Autowired
    private UserRegisterDao dao1;

   @CrossOrigin(origins = "*")
   @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
   public HashMap<String, String> Adminpage(@RequestBody UserRegister u){
       HashMap<String, String> map = new HashMap<>();
       map.put("status", "success");
       return map;
   }

    @CrossOrigin(origins = "*")
    @PostMapping("/userlogin")
    public String UserLoginpage(){
    return("Welcome to Library UserLoginpage");
   }


    @CrossOrigin(origins = "*")
    @PostMapping(path="/usersignup",consumes = "application/json",produces = "application/json")
    public HashMap<String,String>UserSignuppage(@RequestBody UserRegister u){
    System.out.println(u.getName().toString());
        System.out.println(u.getName());
        dao1.save(u);
        HashMap<String,String> map= new HashMap<>();
        map.put("status","success");
        return map;
   }


    @CrossOrigin(origins = "*")
    @GetMapping("/userview")
    public List<UserRegister> userView(){
        return(List<UserRegister>) dao1.findAll();
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path="/usersearch",consumes = "application/json",produces = "application/json")
    public List<UserRegister>  userSearch(@RequestBody  UserRegister u){
        String name= u.getName();
        System.out.println(name);
        return(List<UserRegister>) dao1.searchUser(u.getName());
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path="/userdelete",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> deleteUser(@RequestBody UserRegister u) {
        String id = String.valueOf(u.getId());
        System.out.println(id);
        dao1.deleteUser(u.getId());
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
    }

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

    @CrossOrigin(origins = "*")
    @PostMapping(path="/delete",consumes = "application/json",produces = "application/json")
    public HashMap<String,String>  bookDelete(@RequestBody Library l){
        String id= String.valueOf(l.getId());
        System.out.println(id);
        dao.deleteBook(l.getId());
        HashMap<String,String> map= new HashMap<>();
        map.put("status","success");
        return map;
   }
}
