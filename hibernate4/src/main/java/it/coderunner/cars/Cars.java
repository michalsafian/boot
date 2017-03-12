package it.coderunner.cars;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cars")
public class Cars {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "marka")
	private String brand;
	
	@Column(name = "model")
	private String model;
	
	@Column(name = "pojemnosc_silnika")
	private String ccm3;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCcm3() {
		return ccm3;
	}
	public void setCcm3(String ccm3) {
		this.ccm3 = ccm3;
	}
	
	@Override
	public String toString(){
		return getId() + ". " + getBrand() + " " + getModel() + " " + getCcm3();
	}
}
