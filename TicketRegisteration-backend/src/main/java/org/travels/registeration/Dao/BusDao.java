package org.travels.registeration.Dao;

import java.util.List;
import java.util.Optional;

import org.travels.registeration.Dto.Bus;
import org.travels.registeration.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BusDao {
	@Autowired
	private BusRepository rep;
	
	public Bus save(Bus bus) {
		return rep.save(bus);
	}
	public Bus update(Bus bus) {
		return rep.save(bus);
	}
	public Optional<Bus> findbyID(int id){
		return rep.findById(id);
	}
    public List<Bus> FindByroutes(String from,String to){
    	return rep.Busroutes(from, to);
    }

}

