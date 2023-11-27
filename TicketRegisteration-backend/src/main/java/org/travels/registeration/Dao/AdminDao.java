package org.travels.registeration.Dao;

import java.util.Optional;

import org.travels.registeration.Dto.Admin;
import org.travels.registeration.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDao {
	@Autowired
	private AdminRepository rep;
	
	public Admin save(Admin ad) {
		return rep.save(ad);
	}
	public Admin Update(Admin ad) {
		return rep.save(ad);
	}
	public Optional<Admin> verifyAdmin(String email, String password){
		return rep.verifyAdmin(email, password);
	}
	public Optional<Admin> verifyAdmin(long phone, String password){
		return rep.verifyAdmin(phone, password);
	}
	public Optional<Admin> findbyid(int id){
		return rep.findById(id);
	}
	public void delete(int id) {
		rep.deleteById(id);
	}

}

