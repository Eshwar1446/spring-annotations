package om.xworkz.integrate.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name="bus")
@Getter
@Setter
public class BmtcEntity implements Serializable{
	
	@Id
	@GenericGenerator(name="auto", strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="Id")
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="NoOfBuses")
	private int noOfBuses;
	@Column(name="Profit")
	private boolean profit;
	
	
	public BmtcEntity() {
		System.out.println("created\t"+this.getClass().getSimpleName());
	}
	public String toString() {
		return "BmtcEntity [id=" + id + ", name=" + name + ", noOfBuses=" + noOfBuses + ", profit=" + profit + "]";
	}
	public BmtcEntity(String name, int noOfBuses, boolean profit) {
		super();
		this.name = name;
		this.noOfBuses = noOfBuses;
		this.profit = profit;
	}


}
