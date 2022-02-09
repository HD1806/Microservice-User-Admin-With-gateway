package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdminModel {
	
	@Id
	private int aid;
	private String aname;
	private String aaddress;

}
