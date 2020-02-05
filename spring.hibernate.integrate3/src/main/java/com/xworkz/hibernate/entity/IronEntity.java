package com.xworkz.hibernate.entity;

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
@Table(name="iron")
public class IronEntity implements Serializable{

		@Id
	@GenericGenerator(name="auto", strategy="increment")
		@GeneratedValue(generator="auto")
		@Column(name="Id")
	private int id;
		@Column(name="Brand")
	private String brand;
		@Column(name="Quality")
	private String quality;
		@Column(name="WarrantyInYear")
	private int warrantyInYear;
		
		public IronEntity() {
		System.out.println("created\t"+this.getClass().getSimpleName());
		}

		@Override
		public String toString() {
			return "IronEntity [id=" + id + ", brand=" + brand + ", quality=" + quality + ", warrantyInYear="
					+ warrantyInYear + "]";
		}

		public IronEntity(String brand, String quality, int warrantyInYear) {
			super();
			this.brand = brand;
			this.quality = quality;
			this.warrantyInYear = warrantyInYear;
		}
		
}
