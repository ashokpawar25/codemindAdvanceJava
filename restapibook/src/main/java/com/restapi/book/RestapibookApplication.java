package com.restapi.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.restapi.book.dao.BookRepositery;

@SpringBootApplication
//@EntityScan(basePackages = "com.restapi.book.entity")
public class RestapibookApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(RestapibookApplication.class, args);
		BookRepositery bookRepositery =context.getBean(BookRepositery.class);
	}

}
