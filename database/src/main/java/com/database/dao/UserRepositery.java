package com.database.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.database.entity.User;


public interface UserRepositery extends CrudRepository<User,Integer> {
	
	
//	methods defined by us EX1 (JPQL -java persistence query language) native queries
	public List<User> findByName(String name); 
	
//	EX2
	public List<User> findByCity(String city);
	
//	EX3
	public List<User> findByNameAndCity(String name,String city);
		
//	simple SQL queries
	@Query(value = "select * from user", nativeQuery=true)
	public List<User> findAllUsers();

}
