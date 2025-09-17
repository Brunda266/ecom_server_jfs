package com.mtd.ecom_server.execptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.HttpStatus;


public class GlobalExecptionHandler {
	@ExceptionHandler(ResourceNotFound.class)
	public ResponseEntity<String> handleNotFound(String msg){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(msg);
		
	}

}
