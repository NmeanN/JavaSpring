package com.example.MyBookShopApp.repo;

import com.example.MyBookShopApp.entity.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Integer> {

}
