package com.hrm.performance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.hrm.performance.entity.Task;

public interface TaskRepository extends CrudRepository<Task, Long>{

}
