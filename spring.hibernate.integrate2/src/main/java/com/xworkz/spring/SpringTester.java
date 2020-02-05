package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.dao.VidhanSoudhaDAO;
import com.xworkz.spring.entity.VidhanSoudhaEntity;

public class SpringTester {

	public static void main(String[] args) {
		try {
			ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
			VidhanSoudhaDAO refOfVidhanSoudhaDAO = container.getBean(VidhanSoudhaDAO.class);
			refOfVidhanSoudhaDAO.save(new VidhanSoudhaEntity("Vidhan Soudha", "Cubbon Park", 205));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
