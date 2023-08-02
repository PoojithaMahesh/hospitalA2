package com.jsp.hospital.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.hospital.dto.Address;
import com.jsp.hospital.service.AddressService;
import com.jsp.hospital.util.ResponseStructure;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	private AddressService  service;
	
	@PostMapping
	public ResponseEntity<ResponseStructure<Address>> saveAddress(@Valid @RequestBody Address address){
		return service.saveAddress(address);
	}
}
