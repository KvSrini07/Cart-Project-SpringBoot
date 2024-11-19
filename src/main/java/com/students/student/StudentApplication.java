package com.students.student;

import com.students.student.entity.Item;
import com.students.student.entity.Card;
import com.students.student.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication{
	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

//	@Autowired
//	private ItemRepository postRepository;
//

//	@Override
//	public void run(String... args) throws Exception {
//
//		Card post = new Card("one to many mapping using JPA and hibernate","one to many mapping using JPA and hibernate");
//
//		Item comment1 = new Item("Very useful");
//		Item comment2 = new Item("informative");
//		Item comment3 = new Item("Great Post");
//
//		Item comment4 = new Item("Spring Boot");
//		Item comment5 = new Item("Java");
//		Item comment6 = new Item("JPA");
//
//		post.getComments().add(comment1);
//		post.getComments().add(comment2);
//		post.getComments().add(comment3);
//		post.getComments().add(comment4);
//		post.getComments().add(comment5);
//		post.getComments().add(comment6);
//
//
//
//		this.postRepository.save(post);
//	}
}
