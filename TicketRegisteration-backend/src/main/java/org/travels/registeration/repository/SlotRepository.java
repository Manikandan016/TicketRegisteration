package org.travels.registeration.repository;

import org.travels.registeration.Dto.Slots;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SlotRepository extends JpaRepository<Slots, Integer> {

}