package org.travels.registeration.Service;

import java.util.Optional;

import org.travels.registeration.Dto.User;
import org.travels.registeration.Dto.ResponseStructure;
import org.travels.registeration.Exception.IdNotFoundException;
import org.travels.registeration.Exception.InvalidCredentialsException;
import org.travels.registeration.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserDao dao;
	public ResponseEntity<ResponseStructure<User>> save(User ad){
		ResponseStructure<User> res=new ResponseStructure<>();
		res.setData(dao.save(ad));
		res.setMessage("User has been saved");
		res.setHttpstatus(HttpStatus.CREATED.value());
		return new ResponseEntity<ResponseStructure<User>>(res,HttpStatus.CREATED);
	}
	public ResponseEntity<ResponseStructure<User>> Update(User ad){
		ResponseStructure<User> res=new ResponseStructure<>();
		res.setData(dao.Update(ad));
		res.setMessage("User has been Updated");
		res.setHttpstatus(HttpStatus.ACCEPTED.value());
		return new ResponseEntity<ResponseStructure<User>>(res,HttpStatus.ACCEPTED);
	}
	public ResponseEntity<ResponseStructure<User>> findbyid(int id){
		ResponseStructure<User> res=new ResponseStructure<>();
		Optional<User> op=dao.findbyid(id);
		if(op.isPresent()) {
		res.setData(op.get());
		res.setMessage("User has been found");
		res.setHttpstatus(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<User>>(res,HttpStatus.OK);
		}
		throw new IdNotFoundException();
	}
	public ResponseEntity<ResponseStructure<User>> verifyUser(String email,String password){
		ResponseStructure<User> res=new ResponseStructure<>();
		Optional<User> op=dao.verifyUser(email, password);
		if(op.isPresent()) {
			res.setData(op.get());
			res.setMessage("User found");
			res.setHttpstatus(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<User>>(res,HttpStatus.OK);
			
		}
		throw new InvalidCredentialsException();
	}
	public ResponseEntity<ResponseStructure<User>> verifyUser(long phone,String password){
		ResponseStructure<User> res=new ResponseStructure<>();
		Optional<User> op=dao.verifyUser(phone, password);
		if(op.isPresent()) {
			res.setData(op.get());
			res.setMessage("User found");
			res.setHttpstatus(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<User>>(res,HttpStatus.OK);
			
		}
		throw new InvalidCredentialsException();
	}
	public ResponseEntity<ResponseStructure<String>> delete(int id){
		ResponseStructure<String> res=new ResponseStructure<>();
		Optional<User> op=dao.findbyid(id);
		if(op.isPresent()) {
			dao.delete(id);
			res.setData("User has been deleted");
			res.setMessage("User found");
			res.setHttpstatus(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<String>>(res,HttpStatus.OK);
			
		}
		throw new InvalidCredentialsException();
	}
	
}

