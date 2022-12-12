package com.example.MyBookShopApp.service;

import com.example.MyBookShopApp.entity.AuthorEntity;
import com.example.MyBookShopApp.repo.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class AuthorService {
    AuthorRepository repo;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.repo = authorRepository;
    }

    @Transactional
    public Map<String, List<AuthorEntity>> getAuthorsMap() {
        List<AuthorEntity> authors = repo.findAll();
        return authors.stream().collect(Collectors.groupingBy((AuthorEntity a) -> a.getName().substring(0, 1)));
    }
}
