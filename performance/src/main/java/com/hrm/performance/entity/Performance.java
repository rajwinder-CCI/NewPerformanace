package com.hrm.performance.entity;

import javax.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Performance {
	
	@Id
	private int id;
	
	@Column(columnDefinition = "json")
	private String Section;
	
	@Column(columnDefinition = "json")
	private String Question;
	
	
	
	

}
