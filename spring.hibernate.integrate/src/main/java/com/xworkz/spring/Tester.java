package com.xworkz.spring;

import org.hibernate.HibernateException;
import com.xworkz.spring.dao.TravelAgencyDAOImpl;
import com.xworkz.spring.dao.TravenAgencyDAO;
import com.xworkz.spring.entity.TravelAgencyEntity;
import com.xworkz.util.MySingleton;


public class Tester {
	

	public static void main(String[] args) {

		try {
			TravenAgencyDAO dao = new TravelAgencyDAOImpl();
			TravelAgencyEntity se = new TravelAgencyEntity("Balaji", 50, 10, 3);
			dao.save(se);
}	catch (HibernateException she) {
	she.printStackTrace();
}
		finally {
			MySingleton.getFactory().close();
		}
}
}