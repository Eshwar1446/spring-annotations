package com.xworkz.hibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.hibernate.entity.IronEntity;

public class IronDAOImpl implements IronDAO{

	private SessionFactory factory;
	
	public void setFactory(SessionFactory factory) {
		System.out.println("invoked setFactory\t"+factory);
		this.factory=factory;
	}
	public IronDAOImpl() {
		System.out.println("created\t"+this.getClass().getSimpleName());
	}
	public void save(IronEntity ie) {
		Session session = factory.openSession();
		try {
			session.beginTransaction(); 
			System.out.println("Transaction started");
			session.save(ie);
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
