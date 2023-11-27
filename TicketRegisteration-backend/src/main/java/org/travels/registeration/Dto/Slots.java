package org.travels.registeration.Dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Slots {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String seat_no;
    private double seat_cost;
    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private Ticket ticket;
    @Override
	public String toString() {
		return "Slots [id=" + id + ", seat_no=" + seat_no + ", seat_cost=" + seat_cost + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSeat_no() {
		return seat_no;
	}
	public void setSeat_no(String seat_no) {
		this.seat_no = seat_no;
	}
	public double getSeat_cost() {
		return seat_cost;
	}
	public void setSeat_cost(double seat_cost) {
		this.seat_cost = seat_cost;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
    
    
    
}

