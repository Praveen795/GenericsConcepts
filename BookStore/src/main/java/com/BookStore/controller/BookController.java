package com.BookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BookStore.dao.Book;
import com.BookStore.serviceImpl.BookServiceImpl;

@RestController
@RequestMapping("/Book")
public class BookController {
	
	@Autowired
	public BookServiceImpl bookServiceImpl;
	
	@GetMapping
	public ResponseEntity<List<Book>> getAllBooks(){
		
		return  bookServiceImpl.getAllBooks();
	}
	
	
	@PostMapping
	public ResponseEntity<Book> createBook(@RequestBody Book book){
		return bookServiceImpl.createnewBook(book);
	}

}
