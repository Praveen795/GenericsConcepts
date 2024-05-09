package com.BookStore.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.BookStore.dao.Book;

public interface BookService {
	
	public ResponseEntity<List<Book>> getAllBooks();
	
	
	public ResponseEntity<Book> createnewBook(Book book);

}
