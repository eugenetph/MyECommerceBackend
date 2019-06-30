package com.myecommerce.service;

import java.util.ArrayList;
import java.util.List;

import com.myecommerce.model.Book;
//import org.apache.maven.myecommerce.repository.BookRepository;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

//	@Autowired
//	BookRepository bookRepository;
	
	List<Book> books = new ArrayList<Book>();
	
	public List<Book> getAllBook() {
		createBook();
		return books;
	}
	
	public Book getBook(int id) {
		createBook();
		for(Book book: books) 
			if(book.getId() == id) 
				return book;
		return null;
	}
	
	public void createBook() {
		books.add(new Book(0, "Superman", "This is Superman", 10.50));
		books.add(new Book(1, "Batman", "This is Batman", 11.50));
		books.add(new Book(2, "Wonderwoman", "This is Wonderwoman", 12.50));
	}
}
