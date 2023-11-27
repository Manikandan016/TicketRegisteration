package org.travels.registeration.Exception;

import org.travels.registeration.Dto.ResponseStructure;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class MainExceptionHandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<ResponseStructure<String>> Idnotfound(IdNotFoundException e){
		ResponseStructure<String> res=new ResponseStructure<>();
		res.setData("Id not found");
		res.setMessage(e.getMessage());
		res.setHttpstatus(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<ResponseStructure<String>>(res,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(InvalidCredentialsException.class)
	public ResponseEntity<ResponseStructure<String>> Idfound(InvalidCredentialsException e){
		ResponseStructure<String> res=new ResponseStructure<>();
		res.setData("Admin not found");
		res.setMessage(e.getMessage());
		res.setHttpstatus(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<ResponseStructure<String>>(res,HttpStatus.NOT_FOUND);
	}
 
}
