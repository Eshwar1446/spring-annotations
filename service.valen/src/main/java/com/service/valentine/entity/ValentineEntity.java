package com.service.valentine.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="valen")
public class ValentineEntity implements Serializable{

		@Id
		@GenericGenerator(name="auto", strategy="increment")
		@GeneratedValue(generator="auto")
		@Column(name="ID")
		private int vid;
		@Column(name="name")
		private String name;
		@Column(name="status")
		private String status;
		@Column(name="amountSpent")
		private double amountSpent;
		@Column(name="gift")
		private String gift;
		
		
		public ValentineEntity() {
			System.out.println("created\t"+this.getClass().getSimpleName());
		}

		@Override
		public String toString() {
			return "ValentineEntity [vid=" + vid + ", name=" + name + ", status=" + status + ", amountSpent="
					+ amountSpent + ", gift=" + gift + "]";
		}
		

		public ValentineEntity(String name, String status, double amountSpent, String gift) {
			super();
			this.name = name;
			this.status = status;
			this.amountSpent = amountSpent;
			this.gift = gift;
		}

		public int getVid() {
			return vid;
		}

		public void setVid(int vid) {
			this.vid = vid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public double getAmountSpent() {
			return amountSpent;
		}

		public void setAmountSpent(double amountSpent) {
			this.amountSpent = amountSpent;
		}

		public String getGift() {
			return gift;
		}

		public void setGift(String gift) {
			this.gift = gift;
		}
		
}
