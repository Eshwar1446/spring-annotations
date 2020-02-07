package com.service.valentine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.valentine.entity.ValentineEntity;
import com.service.valentine.service.ValentineService;


public class ServiceTester {

	public static void main(String[] args) {
		try {
			ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
			ValentineService refOfValentineService = container.getBean(ValentineService.class);
			
			
			
			ValentineEntity   refOfValentineEntity = new ValentineEntity();
			refOfValentineEntity.setName("Eshwar");
			refOfValentineEntity.setGift("Heart");
			refOfValentineEntity.setAmountSpent(2000.20);
			refOfValentineEntity.setStatus("Sucess");
			
			refOfValentineService.validatAndSave(refOfValentineEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
