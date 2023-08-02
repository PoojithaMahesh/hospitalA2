package com.jsp.hospital.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.jsp.hospital.dto.Hospital;
import com.jsp.hospital.repository.HospitalRepo;

@Repository
public class HospitalDao {
@Autowired
private HospitalRepo repo;

public Hospital saveHospital(Hospital hospital) {
	return repo.save(hospital);
}

public Hospital updateHospital(int hospitalId, Hospital hospital) {
Optional<Hospital> optional=repo.findById(hospitalId);
if(optional.isPresent()) {
	hospital.setHospitalId(hospitalId);
	return repo.save(hospital);
}
	return null;
}
public Hospital findHospitalByName(String name) {
	Optional<Hospital> optional=repo.findHospitalByName(name);
	if(optional.isPresent()) {
		return optional.get();
	}
	return null;
}
public Hospital findBYId(int id) {
	Optional<Hospital> optional=repo.findById(id);
	if(optional.isPresent()) {
		return optional.get();
	}
	return null;
}
}
