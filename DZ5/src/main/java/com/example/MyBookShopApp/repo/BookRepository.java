package com.example.MyBookShopApp.repo;

import com.example.MyBookShopApp.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<BookEntity, Integer> {

    //List<BookEntity> findBookEntitiesByAuthorEntity_Name(String name);

    @Query("from BookEntity")
    List<BookEntity> customFindAllBooks();
}
