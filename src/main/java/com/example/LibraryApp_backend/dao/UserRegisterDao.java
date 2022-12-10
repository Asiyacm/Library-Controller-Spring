package com.example.LibraryApp_backend.dao;

import com.example.LibraryApp_backend.Model.Library;
import com.example.LibraryApp_backend.Model.UserRegister;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRegisterDao extends CrudRepository<UserRegister,Integer> {
    @Query(value = "SELECT `id`, `aadharno`, `adress`, `confirmpassword`, `dateofbirth`, `emailid`, `name`, `password`, `phoneno`, `pincode`, `username` FROM `user_register` WHERE `name` LIKE %:name%",nativeQuery = true)
    List<UserRegister> searchUser(@Param("name")String name);
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `user_register` WHERE `id`=:id",nativeQuery = true)
    void deleteUser(@Param("id")Integer id);
}
