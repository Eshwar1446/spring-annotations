package om.xworkz.integrate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HibernateTester {

	public static void main(String[] args) {
		try {
			ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
