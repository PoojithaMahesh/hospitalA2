package com.jsp.hospital.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	@NotNull(message = "StreetName should not be null")
	@NotBlank(message = "StreetNameShould not be blank")
	private String stretName;
	private long flatNo;
	@NotNull(message = "CITY should not be null")
	@NotBlank(message = "City not be blank")
	private String city;
	@NotNull(message = "state should not be null")
	@NotBlank(message = "state should not be blank")
	private String state;
	@Min(500001)
	@Max(599999)
	private long pincode;

	

}
