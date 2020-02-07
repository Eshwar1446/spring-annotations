package com.service.valentine.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.service.valentine.dao.ValentineDAO;
import com.service.valentine.entity.ValentineEntity;

@Component
public class ValentineServiceImpl implements ValentineService {

	@Autowired
	private ValentineDAO dao;
	
	public ValentineServiceImpl() {
		System.out.println("created\t"+this.getClass().getSimpleName());
	}
	public boolean validatAndSave(ValentineEntity entity) {
		System.out.println("invoked validatAndSave\t"+entity);
		System.out.println("yet to validate");
		Integer id = dao.save(entity);
		if(Objects.nonNull(id)) {
			System.out.println("entity saved");
			return true;
		}
		System.out.println("entity not saved");
		return false;
	
	}

}
