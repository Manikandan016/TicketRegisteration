package org.travels.registeration.Service;

import java.util.Optional;

import org.travels.registeration.Dto.Admin;
import org.travels.registeration.Dto.ResponseStructure;
import org.travels.registeration.Exception.InvalidCredentialsException;
import org.travels.registeration.Dao.AdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

@Service
public class AdminService {
	@Autowired
	private AdminDao dao;
	public ResponseEntity<ResponseStructure<Admin>> save(Admin ad){
		ResponseStructure<Admin> res=new ResponseStructure<>();
		res.setData(dao.save(ad));
		res.setMessage("Admin has been saved");
		res.setHttpstatus(HttpStatus.CREATED.value());
		return new ResponseEntity<ResponseStructure<Admin>>(res,HttpStatus.CREATED);
	}
	public ResponseEntity<ResponseStructure<Admin>> Update(Admin ad){
		ResponseStructure<Admin> res=new ResponseStructure<>();
		res.setData(dao.Update(ad));
		res.setMessage("Admin has been Updated");
		res.setHttpstatus(HttpStatus.ACCEPTED.value());
		return new ResponseEntity<ResponseStructure<Admin>>(res,HttpStatus.ACCEPTED);
	}
	public ResponseEntity<ResponseStructure<Admin>> verifyAdmin(String email,String password){
		ResponseStructure<Admin> res=new ResponseStructure<>();
		Optional<Admin> op=dao.verifyAdmin(email, password);
		if(op.isPresent()) {
			res.setData(op.get());
			res.setMessage("Admin found");
			res.setHttpstatus(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<Admin>>(res,HttpStatus.OK);
			
		}
		throw new InvalidCredentialsException();
	}
	public ResponseEntity<ResponseStructure<Admin>> verifyAdmin(long phone,String password){
		ResponseStructure<Admin> res=new ResponseStructure<>();
		Optional<Admin> op=dao.verifyAdmin(phone, password);
		if(op.isPresent()) {
			res.setData(op.get());
			res.setMessage("Admin found");
			res.setHttpstatus(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<Admin>>(res,HttpStatus.OK);
			
		}
		throw new InvalidCredentialsException();
	}
	

}

