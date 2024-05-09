package com.BookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookStore.dao.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
