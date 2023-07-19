package com.hrm.performance.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Admin {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID adminId;
	private String adminName;
	private String designation;
	public UUID getAdminId() {
		return adminId;
	}
	public void setAdminId(UUID adminId) {
		this.adminId = adminId;
	}
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