package com.BookStore.dao;

import com.fasterxml.jackson.annotation.JsonBackReference;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int book_id;
	public String name;
	public int price;
	
	@ManyToOne
	@JoinColumn(name = "author_id")
	@JsonBackReference
	public Author author;

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	

}
