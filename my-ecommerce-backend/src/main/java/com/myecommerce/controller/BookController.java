package com.myecommerce.controller;

import java.util.List;

import org.apache.log4j.Logger;
import com.myecommerce.model.Book;
import com.myecommerce.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	private final static Logger logger = Logger.getLogger(BookController.class);
	
	@Autowired
	private BookService bookService; 
	
	@RequestMapping(value = "/books/{id}", method = RequestMethod.GET)
	public Book getBook(@PathVariable int id) {
		logger.info("Entering getBook method");
		return bookService.getBook(id);
	}
	
	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public List<Book> getAllBooks(){
		logger.info("Entering getAllBooks method");
		return bookService.getAllBook();
	}
}
