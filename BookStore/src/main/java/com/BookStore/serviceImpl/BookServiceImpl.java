package com.BookStore.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.BookStore.dao.Book;
import com.BookStore.repository.BookRepository;
import com.BookStore.repository.AuthorRepository;
import com.BookStore.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	public BookRepository bookRepository;
	
	@Autowired
	public AuthorRepository authorRepository;
	
	

	@Override
	public ResponseEntity<List<Book>> getAllBooks() {
		// TODO Auto-generated method stub
		
		List<Book> books=bookRepository.findAll();
		
		if(books.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}else {
			return ResponseEntity.status(HttpStatus.OK).body(books);
		}
		
	}

	@Override
	public ResponseEntity<Book> createnewBook(Book book) {
		// TODO Auto-generated method stub
		
		Book isbook=bookRepository.save(book);
		if(isbook==null) {
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
			
		}else {
			
			return ResponseEntity.status(HttpStatus.CREATED).body(isbook);
			
		}
		
		
	}

}
