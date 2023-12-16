package com.restapi.book.dao;

import org.springframework.data.repository.CrudRepository;
import com.restapi.book.entity.Book;

public interface BookRepositery extends CrudRepository<Book, Integer> {
	public Book findById(int id);
}
