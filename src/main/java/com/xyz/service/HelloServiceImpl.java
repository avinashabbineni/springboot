package com.xyz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

	@Autowired
	HelloDao dao;
	
	public String getDetails() {
		return dao.getDetails();
	}

}
