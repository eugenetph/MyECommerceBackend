package com.myecommerce.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.myecommerce.model.Book;
import com.myecommerce.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepository;
	
	List<Book> books = new ArrayList<Book>();
	
	public List<Book> getAllBook() {
		//createBook();
		List<Book> books = new ArrayList<Book>();
		books = bookRepository.findAll();
		return books;
	}
	
	public Optional<Book> getBook(String id) {
//		createBook();
		return bookRepository.findById(id);
	}
	
	public void createBook() {
		books.add(new Book("0", "Superman", "This is Superman", 10.50));
		books.add(new Book("1", "Batman", "This is Batman", 11.50));
		books.add(new Book("2", "Wonderwoman", "This is Wonderwoman", 12.50));
	}
}
