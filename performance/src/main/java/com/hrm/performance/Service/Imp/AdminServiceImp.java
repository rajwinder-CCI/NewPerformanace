package com.hrm.performance.Service.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hrm.performance.Repository.AdminRepository;
import com.hrm.performance.Repository.TaskRepository;
import com.hrm.performance.Service.*;
import com.hrm.performance.dto.AddAdminDTO;
import com.hrm.performance.dto.AddTaskDTO;
import com.hrm.performance.entity.Admin;
import com.hrm.performance.entity.Performance;
import com.hrm.performance.entity.Task;

@Service
public class AdminServiceImp implements AdminService {

	@Autowired
	private AdminRepository adminRepository;

	@Autowired
	private TaskRepository taskRepository;

	@Override
	public Admin addAdmin(AddAdminDTO addAdminDTO) {
		Admin admin = new Admin();
		admin.setAdminName(addAdminDTO.getAdminName());
		admin.setDesignation(addAdminDTO.getDesignation());
		return adminRepository.save(admin);
	}

	@Override
	public Task addTask(AddTaskDTO addTaskDTO) {
		Task task = new Task();
		task.setId(addTaskDTO.getId());
		task.setTaskName(addTaskDTO.getTaskName());
		return taskRepository.save(task);
	}

	@Override
	public void updateTask(AddTaskDTO addTaskDTO) throws JsonProcessingException {
		Task task = new Task();
		task.setTaskName(addTaskDTO.getTaskName());
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = mapper.writeValueAsString(task);
		System.out.println(jsonString);
		//taskRepository.save(jsonString);

	}

	@Override
	public void newtask() throws JsonProcessingException {
		// TODO Auto-generated method stub
		
	}
	
//	public void newtask() throws JsonProcessingException {
//		Task task = new Task();
//		
//		 ObjectMapper mapper = new ObjectMapper();
//	      //Converting the Object to JSONString
//	      String jsonString = mapper.writeValueAsString(task);
//	      System.out.println(jsonString);
//	      taskRepository.save(jsonString);
//	}
//
//	@Override
//	public Performance addPerformance(Performance performance) {
//
//		return null;
//	}
//
}
