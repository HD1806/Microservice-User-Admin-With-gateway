package com.example.demo.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdminDto {
	
	private int aid;
	private String aname;
	private String aaddress;

}
