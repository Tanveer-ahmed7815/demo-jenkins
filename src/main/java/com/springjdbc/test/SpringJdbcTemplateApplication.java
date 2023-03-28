package com.springjdbc.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springjdbc.test.dao.UserDao;

@SpringBootApplication
public class SpringJdbcTemplateApplication implements CommandLineRunner {

	@Autowired
	private UserDao userDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcTemplateApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(userDao.insertUser(101, "Tanveer", 27, "Bangalore"));

	}

}
