package org.travels.registeration.repository;

import java.util.List;
import java.util.Optional;

import org.travels.registeration.Dto.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BusRepository extends JpaRepository<Bus, Integer> {
	@Query("select b from Bus b where b.from=?1 and b.to=?2")
	public List<Bus> Busroutes(String from,String to);

}

