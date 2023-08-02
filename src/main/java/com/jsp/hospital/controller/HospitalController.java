package com.jsp.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.hospital.dto.Hospital;
import com.jsp.hospital.service.HospitalService;
import com.jsp.hospital.util.ResponseStructure;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

	@Autowired
	private HospitalService service;
	
	@PostMapping
	public ResponseEntity<ResponseStructure<Hospital>> saveHospital(@RequestBody Hospital hospital){
		return service.saveHospital(hospital);
	}
	@PutMapping
	public ResponseEntity<ResponseStructure<Hospital>> updateHospital(@RequestParam int hospitalId,
			@RequestBody Hospital hospital){
		return service.updateHospital(hospitalId,hospital);
	}
	@GetMapping("/findbyname")
	public ResponseEntity<ResponseStructure<Hospital>> findHospitalByName(@RequestParam String name){
		return service.findHospitalByName(name);
	}
	@GetMapping
	public ResponseEntity<ResponseStructure<Hospital>> findHospitalById(@RequestParam int id){
		return service.findHospitalById(id);
	}
}
