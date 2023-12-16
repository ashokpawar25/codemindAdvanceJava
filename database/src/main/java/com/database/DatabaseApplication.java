package com.database;
import com.database.dao.UserRepositery;
import com.database.entity.User;

import java.nio.channels.AcceptPendingException;
import java.security.PublicKey;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.hibernate.query.results.implicit.ImplicitResultClassBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DatabaseApplication {

	public static void main(String[] args) {
		
		ApplicationContext context=	SpringApplication.run(DatabaseApplication.class, args);
		UserRepositery userRepositery=context.getBean(UserRepositery.class);
		
		User user= new User();
		user.setName("ashok");
		user.setCity("Pandharpur");
		user.setStatus("I am a programmer");
		
		User user2=new User();
		user2.setName("Sudhir");
		user2.setCity("Mangalwedha");
		user2.setStatus("fullstack developer");
		
		User user3=new User();
		user3.setName("vinod");
		user3.setCity("Kauthali");
		user3.setStatus("Backend developer");
		
//		save one id at a time
//		User user1= userRepositery.save(user);
//		System.out.println(user1.getId());
		
		
//		Save multiple objects at a time
//		Iterable<User> usersIterable=List.of(user,user2,user3);
//		userRepositery.saveAll(usersIterable);
//		System.out.println("Saved All users");
		
//		Optional<User> optional = userRepositery.findById(152);
//		User user4=optional.get();
//		user4.setStatus("java Developer");
//		userRepositery.save(user4);
//		System.out.println("updated user");
		
//		print using Consumer
//		Iterable<User> itr= userRepositery.findAll();
//		itr.forEach(new Consumer<User>()->{
//			@Override
//			Public void accept(User t)
//			{
//				System.out.println(t);
//			}
//		});
		
		
		
//		print using iteratot
//		Iterable<User> itr=userRepositery.findAll();
//		Iterator<User> iterator=itr.iterator();
//		
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next().toString());
//			
//		}
		
//		print using lambda function
//		Iterable<User> allusers= userRepositery.findAll();
//		allusers.forEach(euser->{
//			System.out.println(euser);
//		});
		
		
//		delete specific object
//		userRepositery.deleteById(154);
//		System.out.println("deleted user");
		
//		delete multiple users at a time
//		Iterable<User> user=userRepositery.findAll();
//		userRepositery.deleteAll();
//		System.out.println("deleted");
		
		

//		List<User> users = userRepositery.findByName("ashok");
//		users.forEach(e->{System.out.println(e);});
		
//		List<User> users = userRepositery.findByCity("mangalwedha");
//		users.forEach(e->{System.out.println(e); });
		
//		List<User> users = userRepositery.findByNameAndCity("sudhir","mangalwedha");
//		users.forEach(e->{System.out.println(e);});
				
//		List<User> users = userRepositery.findAllUsers();
//		users.forEach(e->{System.out.println(e);});
	}

}
