package om.xworkz.integrate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import om.xworkz.integrate.dao.BmtcDAO;
import om.xworkz.integrate.entity.BmtcEntity;

public class SpringTester {


	public static void main(String[] args) {
		try {
			ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
			BmtcDAO refOfBmtcDAO = container.getBean(BmtcDAO.class);
			refOfBmtcDAO.save(new BmtcEntity("Vajra", 135, true));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
