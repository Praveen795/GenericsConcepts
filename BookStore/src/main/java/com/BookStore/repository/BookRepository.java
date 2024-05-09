package com.BookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookStore.dao.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
