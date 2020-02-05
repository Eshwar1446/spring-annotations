package com.spring.annotation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DBConnection {

	@Value("${db.connection.url}")
	private String url;
	@Value("${db.connection.username}")
	private String username;
	@Value("${db.connetion.password}")
	private String password;
	@Value("${db.connetion.driver}")
	private String driver;
	
	private Connection connection;
	
	public DBConnection() {
		System.out.println("created\t"+this.getClass().getSimpleName());
	}
	
	
	@PostConstruct  //jdk 1.8
	public void initResource() {
		try {
			System.out.println("init the resources");
			System.out.println("url"+this.url);
			System.out.println("username"+this.username);
			System.out.println("password"+this.password);
			System.out.println("driver"+this.driver);
			Class.forName(driver);
			this.connection = DriverManager.getConnection(this.url,this.username,this.password);
			System.out.println("Resources connetion is created"+this.connection);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void operartion() throws SQLException {
		System.out.println("invoked operation");
		System.out.println("this.connection.isClosed()");
	}
	
	@PreDestroy
	public void closeResources() {
		System.out.println("invoked close resources");
		try {
			this.connection.close();
			System.out.println("resoures is closed");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
