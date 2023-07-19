package com.hrm.performance.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
@Data
@JsonFormat
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddAdminDTO {

    private String adminName;
    private String designation;
  
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
    



}
