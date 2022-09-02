package com.vehicleCompany.vehicleCrudDemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleCompany.vehicleCrudDemo.model.Vehicle;
import com.vehicleCompany.vehicleCrudDemo.repository.VehicleRepository;

@Service
public class VehicleService implements VehicleServiceImpl {
	
	@Autowired
	VehicleRepository vehicleRepository;

	@Override
	public List<Vehicle> getAllVehicles() {
		
		return vehicleRepository.findAll();
	}

	@Override
	public Vehicle getVehicleById(int id) {
		Optional<Vehicle> vehOptional = vehicleRepository.findById(id);
		return vehOptional.get();
	}

	@Override
	public Vehicle addVehicle(Vehicle vehicle) {
		
		return vehicleRepository.save(vehicle);
	}

	@Override
	public Vehicle updateVehicle(Vehicle vehicle) {
		Optional<Vehicle> vehOptional = vehicleRepository.findById(vehicle.getVehicle_id());
		if (vehOptional.isPresent()) {
			return vehicleRepository.save(vehicle);
		}
		else {
			return null;	//Exception will be added
		}
	}

	@Override
	public Vehicle deleteVehicle(int id) {
		Optional<Vehicle> vehOptional = vehicleRepository.findById(id);
		if (vehOptional.isPresent()) {
			Vehicle veh =vehOptional.get();
			 vehicleRepository.delete(veh);
			 return veh;
		}
		else {
			return null;	//Exception will be added
		}
	}

}
