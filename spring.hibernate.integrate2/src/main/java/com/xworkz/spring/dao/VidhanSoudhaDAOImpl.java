package com.xworkz.spring.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.spring.entity.VidhanSoudhaEntity;



public class VidhanSoudhaDAOImpl implements VidhanSoudhaDAO{
	
	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		System.out.println("invoked setFactoery\t"+factory);
		this.factory=factory;
	}
	public VidhanSoudhaDAOImpl() {
		System.out.println("created\t"+this.getClass().getSimpleName());
	}
	public void save(VidhanSoudhaEntity vs) {
		Session session = factory.openSession();
		try {
			session.beginTransaction(); 
			System.out.println("Transaction started");
			session.save(vs);
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
