package com.vehicleCompany.vehicleCrudDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleCompany.vehicleCrudDemo.model.Vehicle;
import com.vehicleCompany.vehicleCrudDemo.service.VehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleService;

//	http://localhost:8080/vehicle/get-all-vehicles
	@GetMapping("/get-all-vehicles")
	public List<Vehicle> getAllVehicles(){
		return vehicleService.getAllVehicles();
	}
	
//	http://localhost:8080/vehicle/get-vehicle-by-id/{vid}
	@GetMapping("/get-vehicle-by-id/{vid}") 
	public Vehicle getVehicleById(@PathVariable(name = "vid") int vehicleId) {
		return vehicleService.getVehicleById(vehicleId);
	}
	
	
//	http://localhost:8080/vehicle/add-vehicle
	@PostMapping("/add-vehicle")
	public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
		Vehicle veh=vehicleService.addVehicle(vehicle);
		return veh;
	}

//	http://localhost:8080/vehicle/update-vehicle
	@PutMapping("/update-vehicle")
	public Vehicle updateVehicle(@RequestBody Vehicle vehicle) {
		Vehicle veh=vehicleService.updateVehicle(vehicle);
		return veh;
	}
	
//	http://localhost:8080/vehicle/delete-vehicle/{vid}
	@DeleteMapping("/delete-vehicle/{vid}") 
	public Vehicle deleteVehicle(@PathVariable(name = "vid") int vehicleId) {
		return vehicleService.deleteVehicle(vehicleId);
	}
	
	
	
	
	

}
