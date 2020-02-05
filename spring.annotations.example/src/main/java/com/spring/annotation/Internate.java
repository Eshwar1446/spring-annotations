package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Internate {

	@Value("101")
	private int speed;
	private String provider;
	
	@Autowired
	public Internate(@Value("airtel") String provider) {
		System.out.println("created\t"+this.getClass().getSimpleName());
		System.out.println(provider);
		this.provider=provider;
	}
	
	//@Value("108")
	public void setSpeed(int speed) {
		System.out.println("invoked setSpeed  method\t"+speed);
		this.speed = speed;
	}
	public int getSpeed() {
		System.out.println("speed\t"+speed);
		return speed;
	}
	public String getProvider() {
		System.out.println("provider\t"+provider);
		
		return provider;
	}
}
