package com.BookStore.dao;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Author {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	public int author_id;
	public String name;
	public String address;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "author")
	@JsonManagedReference
	public List<Book> book;

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	
	
	
	
	
	
	

}
