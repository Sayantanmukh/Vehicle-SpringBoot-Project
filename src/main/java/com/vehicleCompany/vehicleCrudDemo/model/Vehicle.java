package com.vehicleCompany.vehicleCrudDemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Vehicle")
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vehicle_id")
	private int vehicle_id;
	
	@Column(name = "vehicle_name")
	private String vehicle_name;
	
	@Column(name = "vehicle_type")
	private String vehicle_type;
	
	@Column(name = "vehicle_cost")
	private int vehicle_cost;
	
	
	
	public int getVehicle_id() {
		return vehicle_id;
	}



	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}



	public String getVehicle_name() {
		return vehicle_name;
	}



	public void setVehicle_name(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}



	public String getVehicle_type() {
		return vehicle_type;
	}



	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}



	public int getVehicle_cost() {
		return vehicle_cost;
	}



	public void setVehicle_cost(int vehicle_cost) {
		this.vehicle_cost = vehicle_cost;
	}



	public Vehicle(int vehicle_id, String vehicle_name, String vehicle_type, int vehicle_cost) {
		super();
		this.vehicle_id = vehicle_id;
		this.vehicle_name = vehicle_name;
		this.vehicle_type = vehicle_type;
		this.vehicle_cost = vehicle_cost;
	}



	public Vehicle() {
	}

}
