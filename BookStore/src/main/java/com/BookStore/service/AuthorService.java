package com.BookStore.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.BookStore.dao.Author;


public interface AuthorService {
	
	public ResponseEntity<List<Author>> getAllAuthor();

	public ResponseEntity<Author> createnewAuthor(Author author);

}
