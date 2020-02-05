package com.xworkz.spring.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.spring.entity.TravelAgencyEntity;


public class TravelAgencyDAOImpl implements TravenAgencyDAO{
	//private SessionFactory factory = MySingleton.getFactory();
		private SessionFactory factory;
		
		public void setFactory(SessionFactory factory){
			System.out.println("invoked setFactory method\t"+factory );
			this.factory=factory;
		} 
		
	public TravelAgencyDAOImpl() {
	System.out.println("created\t"+this.getClass().getSimpleName());
	}

	
	public void save(TravelAgencyEntity te) {
		Session session = factory.openSession();
		try {
			session.beginTransaction(); 
			System.out.println("Transaction started");
			session.save(te);
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
