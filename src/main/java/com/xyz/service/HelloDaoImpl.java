package com.xyz.service;

import org.springframework.stereotype.Repository;

@Repository
public class HelloDaoImpl implements HelloDao {

	public String getDetails() {
		return "I am spring boot :)";
	}

}
