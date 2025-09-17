package com.mtd.ecom_server.execptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class ResourceNotFound extends RuntimeException {
	public ResourceNotFound(String msg) {super();}

}