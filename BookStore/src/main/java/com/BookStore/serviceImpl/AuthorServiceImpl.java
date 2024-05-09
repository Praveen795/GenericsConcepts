package com.BookStore.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.BookStore.dao.Author;
import com.BookStore.dao.Book;
import com.BookStore.repository.AuthorRepository;
import com.BookStore.repository.BookRepository;
import com.BookStore.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService  {
	
	@Autowired
	public BookRepository bookRepository;
	
	@Autowired
	public AuthorRepository authorRepository;

	@Override
	public ResponseEntity<List<Author>> getAllAuthor() {
		
		
		
	List<Author> authors=authorRepository.findAll();
		
		if(authors.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}else {
			return ResponseEntity.status(HttpStatus.OK).body(authors);
		}
		
		
	}

	@Override
	public ResponseEntity<Author> createnewAuthor(Author author) {
		
		for(Book book:author.getBook()) {
			book.setAuthor(author);
			
		}
		author.setBook(author.getBook());
		
		Author isauthor=authorRepository.save(author);
		if(isauthor==null) {
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
			
		}else {
			
			return ResponseEntity.status(HttpStatus.CREATED).body(isauthor);
			
		}
		
	}

}
