package com.hrm.performance.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat
public class AddTaskDTO {
	private long id;
	private String TaskName;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTaskName() {
		return TaskName;
	}
	public void setTaskName(String taskName) {
		TaskName = taskName;
	}
}
