package com.spring.boot.crud.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.boot.crud.entity.Book;

public interface BooksRepository extends CrudRepository<Book, Integer> {

}
