package org.travels.registeration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.travels.registeration.Dto.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
    
}

