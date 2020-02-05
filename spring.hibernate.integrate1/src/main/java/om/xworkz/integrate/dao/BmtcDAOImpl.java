package om.xworkz.integrate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;



import om.xworkz.integrate.entity.BmtcEntity;

public class BmtcDAOImpl implements BmtcDAO{

	private SessionFactory factory;
	
	public void setFactory(SessionFactory factory) {
		System.out.println("invoked setFactory method\t"+factory);
		this.factory = factory;
	}
	public BmtcDAOImpl() {
		System.out.println("created\t"+this.getClass().getSimpleName());
	}
	public void save(BmtcEntity bm) {
		Session session = factory.openSession();
		try {
			session.beginTransaction(); 
			System.out.println("Transaction started");
			session.save(bm);
			session.getTransaction().commit();
			System.out.println("transaction commited");
		} catch (HibernateException she) {
			System.out.println("Exception occured in save method");
			she.printStackTrace();
		}finally {
			
			session.close();
			System.out.println("resources closed");
			
 		}
}
}