package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.dao.TravenAgencyDAO;
import com.xworkz.spring.entity.TravelAgencyEntity;

public class DaoTester {

	public static void main(String[] args) {
		try {
			ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
			TravenAgencyDAO agencyEntity = container.getBean(TravenAgencyDAO.class);
			agencyEntity.save(new TravelAgencyEntity("Balaji", 50, 10, 3));
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
