package com.vehicleCompany.vehicleCrudDemo.service;

import java.util.List;

import com.vehicleCompany.vehicleCrudDemo.model.Vehicle;

public interface VehicleServiceImpl {

	public abstract List<Vehicle> getAllVehicles();
	public abstract Vehicle getVehicleById(int id);
	public abstract Vehicle addVehicle(Vehicle vehicle);
	public abstract Vehicle updateVehicle(Vehicle vehicle);
	public abstract Vehicle deleteVehicle(int id);

	
	
	
}
