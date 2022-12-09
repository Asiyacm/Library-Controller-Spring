package com.example.LibraryApp_backend.dao;

import com.example.LibraryApp_backend.Model.UserRegister;
import org.springframework.data.repository.CrudRepository;

public interface UserRegisterDao extends CrudRepository<UserRegister,Integer> {
}
