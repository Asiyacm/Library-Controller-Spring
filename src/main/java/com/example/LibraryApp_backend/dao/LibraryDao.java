package com.example.LibraryApp_backend.dao;

import com.example.LibraryApp_backend.Model.Library;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LibraryDao extends CrudRepository<Library,Integer> {

    @Query(value = "SELECT `id`, `author`, `bookimage`, `description`, `distributor`, `language`, `price`, `publisher`, `releasedyear`, `title` FROM `books` WHERE `title`Like %:title%",nativeQuery = true)
    List<Library> searchBook(@Param("title")String title);
}
