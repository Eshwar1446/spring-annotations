package com.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InternateTetser {

	public static void main(String[] args) {
		
		try {
			ApplicationContext container =  new ClassPathXmlApplicationContext("spring.xml");
			Internate ref = container.getBean(Internate.class);
			ref.getSpeed();
			ref.getProvider();
			
			DBConnection refOfDbConnection = container.getBean(DBConnection.class);
			ClassPathXmlApplicationContext castingToImpl = (ClassPathXmlApplicationContext) container;
			castingToImpl.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
