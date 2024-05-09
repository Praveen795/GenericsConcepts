package com.BookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BookStore.dao.Author;

import com.BookStore.serviceImpl.AuthorServiceImpl;

@RestController
@RequestMapping("/Author")
public class AuthorController {
	
	@Autowired
	public AuthorServiceImpl authorServiceImpl;
	
	@GetMapping
	public ResponseEntity<List<Author>> getAllAuthors(){
		
		return  authorServiceImpl.getAllAuthor();
	}
	
	
	@PostMapping
	public ResponseEntity<Author> createAuthor(@RequestBody Author author){
		return authorServiceImpl.createnewAuthor(author);
	}

}
