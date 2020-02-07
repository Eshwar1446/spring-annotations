package com.service.valentine.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.service.valentine.entity.ValentineEntity;
@Component
public class ValentineDAOImpl implements ValentineDAO {
	
	
	
	public ValentineDAOImpl() {
		System.out.println("created\t"+this.getClass().getSimpleName());
	}
	
	public Integer save(ValentineEntity entity) {
		//System.out.println("invoked dao save method");
		//System.out.println("should impl hibernate");
		//Session session = null;
		try {
			System.out.println("dao implment start");
			System.out.println(entity);
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(ValentineEntity.class);
			SessionFactory sf = cfg.buildSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction(); 
			System.out.println("Transaction started");
			session.save(entity);
			session.getTransaction().commit();
			System.out.println("transaction commited");
		} catch (HibernateException she) {
			System.out.println("Exception occured in save method");
			she.printStackTrace();
		}
		return null;
	}

}
