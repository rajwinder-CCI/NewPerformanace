package com.hrm.performance.Exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {
	 public static ResponseEntity<Object> generateSuccessResponse(Object data ,HttpStatus status){
	        Map<String,Object> map=new HashMap<>();
	        map.put("message","Success");
	        map.put("data",data);
	        HttpHeaders headers=new HttpHeaders();
	      
	        return new ResponseEntity<Object>(map,headers,status);
	    }

	    public static ResponseEntity<Object> generateErrorResponse(String message,HttpStatus status){
	        Map<String,Object> map=new HashMap<>();
	        map.put("message",message);
	        map.put("data",null);
	        HttpHeaders headers=new HttpHeaders();
	        return new ResponseEntity<Object>(map,headers,status);
	    }


}
