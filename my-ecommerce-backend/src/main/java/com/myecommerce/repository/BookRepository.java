package com.myecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myecommerce.model.Book;

public interface BookRepository extends JpaRepository<Book, String> {

}
