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
@Setter
@Getter
@Entity
@Table(name="agency")
public class TravelAgencyEntity implements Serializable{

		@Id
		@GenericGenerator(name="sri",strategy = "increment")
		@GeneratedValue(generator="sri")
		@Column(name="id")
	private int tid;
		@Column(name="name")
	private String agencyName;
		@Column(name="noOfVehicles")
	private int noOfVehicles;
		@Column(name="noOfBranch")
	private int noOfBranch;
		@Column(name="rating")
	private int rating;
	
	public TravelAgencyEntity() {
	System.out.println("created\t"+this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "TravelAgencyEntity [tid=" + tid + ", agencyName=" + agencyName + ", noOfVehicles=" + noOfVehicles
				+ ", noOfBranch=" + noOfBranch + ", rating=" + rating + "]";
	}

	public TravelAgencyEntity(String agencyName, int noOfVehicles, int noOfBranch, int rating) {
		super();
		this.agencyName = agencyName;
		this.noOfVehicles = noOfVehicles;
		this.noOfBranch = noOfBranch;
		this.rating = rating;
	}
	
}
