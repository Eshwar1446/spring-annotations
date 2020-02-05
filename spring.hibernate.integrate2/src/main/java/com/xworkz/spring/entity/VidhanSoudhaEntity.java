package com.xworkz.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name="vidhan")
public class VidhanSoudhaEntity implements Serializable{

	@Id
	@GenericGenerator(name="auto", strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="Id")
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Location")
	private String location;
	@Column(name="NoOfOffies")
	private int noOfOffies;
	
	
	public VidhanSoudhaEntity() {
		System.out.println("created\t"+this.getClass().getSimpleName());
	}
	public String toString() {
		return "VidhanSoudhaEntity [id=" + id + ", name=" + name + ", location=" + location + ", noOfOffies="
				+ noOfOffies + "]";
	}
	public VidhanSoudhaEntity(String name, String location, int noOfOffies) {
		super();
		this.name = name;
		this.location = location;
		this.noOfOffies = noOfOffies;
	}
	
	
}
