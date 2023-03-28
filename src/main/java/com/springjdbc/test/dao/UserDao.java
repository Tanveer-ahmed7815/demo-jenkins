package com.springjdbc.test.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public UserDao() {

	}

	public int createTable() {
		String query = "CREATE TABLE IF NOT EXISTS User(id int primary key, name varchar(200),age int,city varchar(100))";
		int rows = this.jdbcTemplate.update(query);
		System.out.println("Constructer called " + rows);
		return rows;
	}

	public int insertUser(int id, String name, int age, String city) {

		String query = "insert into user(id,name,age,city) values(?,?,?,?)";
		return this.jdbcTemplate.update(query, new Object[] { id, name, age, city });
	}
}
