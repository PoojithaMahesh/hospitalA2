package com.jsp.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.hospital.dao.HospitalDao;
import com.jsp.hospital.dto.Hospital;
import com.jsp.hospital.util.ResponseStructure;

@Service
public class HospitalService {

	@Autowired
	private HospitalDao hospitalDao;

	public ResponseEntity<ResponseStructure<Hospital>> saveHospital(Hospital hospital) {
		Hospital dbHospital = hospitalDao.saveHospital(hospital);
		ResponseStructure<Hospital> structure = new ResponseStructure<Hospital>();
		structure.setMessage("Hospital; data saved successfully");
		structure.setStatus(HttpStatus.CREATED.value());
		structure.setData(dbHospital);
		return new ResponseEntity<ResponseStructure<Hospital>>(structure, HttpStatus.CREATED);

	}

	public ResponseEntity<ResponseStructure<Hospital>> updateHospital(int hospitalId, Hospital hospital) {
		Hospital dbHospital = hospitalDao.updateHospital(hospitalId, hospital);
		if (dbHospital != null) {
			ResponseStructure<Hospital> structure = new ResponseStructure<Hospital>();
			structure.setMessage("Hospital; data updated successfully");
			structure.setStatus(HttpStatus.OK.value());
			structure.setData(dbHospital);
			return new ResponseEntity<ResponseStructure<Hospital>>(structure, HttpStatus.OK);
		} else {
			return null;
//raise hospital id not found exception
		}

	}
     public ResponseEntity<ResponseStructure<Hospital>> findHospitalByName(String name){
    	 Hospital dbHospital=hospitalDao.findHospitalByName(name);
    	 if (dbHospital != null) {
 			ResponseStructure<Hospital> structure = new ResponseStructure<Hospital>();
 			structure.setMessage("Hospital; data fetched successfully");
 			structure.setStatus(HttpStatus.OK.value());
 			structure.setData(dbHospital);
 			return new ResponseEntity<ResponseStructure<Hospital>>(structure, HttpStatus.OK);
 		} else {
 			return null;
 //raise hospitalname not found exception
 		}
     }
     public ResponseEntity<ResponseStructure<Hospital>> findHospitalById(int hospitalId){
    	 Hospital dbHospital=hospitalDao.findBYId(hospitalId);
    	 if (dbHospital != null) {
 			ResponseStructure<Hospital> structure = new ResponseStructure<Hospital>();
 			structure.setMessage("Hospital; data fetched successfully");
 			structure.setStatus(HttpStatus.OK.value());
 			structure.setData(dbHospital);
 			return new ResponseEntity<ResponseStructure<Hospital>>(structure, HttpStatus.OK);
 		} else {
 			return null;
 //raise hospitalId not found exception
 		}
     } 
     
	
	
	
	
	
	
	
	
	
	
	
	
}
