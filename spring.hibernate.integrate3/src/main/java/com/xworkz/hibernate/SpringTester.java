package com.xworkz.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.hibernate.dao.IronDAO;
import com.xworkz.hibernate.entity.IronEntity;

public class SpringTester {

	public static void main(String[] args) {
	try {
		ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
		IronDAO refOfIronDAO	=  container.getBean(IronDAO.class);
		refOfIronDAO.save(new IronEntity("sysko", "good", 2));
	} catch (Exception e) {
		e.printStackTrace();
	}

	}

}
