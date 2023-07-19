package com.hrm.performance.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.hrm.performance.dto.AddAdminDTO;
import com.hrm.performance.dto.AddTaskDTO;
import com.hrm.performance.entity.Admin;
import com.hrm.performance.entity.Performance;
import com.hrm.performance.entity.Task;

public interface AdminService {
	
	 public Admin addAdmin(AddAdminDTO addAdminDTO);
	 public Task addTask(AddTaskDTO addTaskDTO);
	 public void updateTask(AddTaskDTO task)throws JsonProcessingException;
	// public Performance addPerformance(Performance performance);
	 public void newtask()throws JsonProcessingException;
}
