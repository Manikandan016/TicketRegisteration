package org.travels.registeration.Dao;

import java.util.Optional;

import org.travels.registeration.Dto.User;
import org.travels.registeration.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	@Autowired
	private UserRepository rep;
	public User save(User ad) {
		return rep.save(ad);
	}
	public User Update(User ad) {
		return rep.save(ad);
	}
	public Optional<User> findbyid(int id){
		return rep.findById(id);
	}
	public void delete(int id) {
		rep.deleteById(id);
	}
	public Optional<User> verifyUser(String email, String password){
		return rep.verifyUser(email, password);
	}
	public Optional<User> verifyUser(long phone, String password){
		return rep.verifyUser(phone, password);
	}
}

