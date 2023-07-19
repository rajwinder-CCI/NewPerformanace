package com.hrm.performance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrm.performance.entity.Admin;


@Repository 
public interface AdminRepository extends JpaRepository<Admin,String> {


//    @Query("select a from Admin a where a.emailId = ?1")
//    public Admin findByEmailId(String adminId);
}
