package com.restapi.book.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.restapi.book.dao.BookRepositery;
import com.restapi.book.entity.Book;

@Component
public class BookServices {
	
	@Autowired
	BookRepositery bookRepositery;
	
	
	public List<Book> getAllBooks() {
		List<Book> list=(List<Book>)this.bookRepositery.findAll();
		return list;
	}
	
	public Book getBook(int id) {
		
		return this.bookRepositery.findById(id);
	}
	
	public Book addBook(Book b) {
		this.bookRepositery.save(b);
		return b;
	}
	
	public void deleteBook(int id) {
		this.bookRepositery.deleteById(id);
	}
	
	public void updateBook(Book book,int id) {
		book.setId(id);
		this.bookRepositery.save(book);
	}
}
