package org.travels.registeration.Dto;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String ticket_no;
	@Column(name = "depature_time")
	private LocalTime deptime;
	@Column(name = "destination_time")
	private LocalTime destime;
	@Column(nullable = false)
	private double amnt_paid;
	private String boarding;
	private String droping;
	@CreationTimestamp
	private LocalDateTime time_of_booking;
	@Column(nullable = false)
	private int number_of_seats;
	@ManyToOne
	@JoinColumn
	@JsonIgnore
	private User user;
	@ManyToOne
	@JoinColumn
	@JsonIgnore
	private Bus bus;
	@OneToMany(mappedBy = "ticket",cascade = CascadeType.ALL)
	private List<Slots> slots;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTicket_no() {
		return ticket_no;
	}
	public void setTicket_no(String ticket_no) {
		this.ticket_no = ticket_no;
	}
	public LocalTime getDeptime() {
		return deptime;
	}
	public void setDeptime(LocalTime deptime) {
		this.deptime = deptime;
	}
	public LocalTime getDestime() {
		return destime;
	}
	public void setDestime(LocalTime destime) {
		this.destime = destime;
	}
	public double getAmnt_paid() {
		return amnt_paid;
	}
	public void setAmnt_paid(double amnt_paid) {
		this.amnt_paid = amnt_paid;
	}
	public String getBoarding() {
		return boarding;
	}
	public void setBoarding(String boarding) {
		this.boarding = boarding;
	}
	public String getDroping() {
		return droping;
	}
	public void setDroping(String droping) {
		this.droping = droping;
	}
	public LocalDateTime getTime_of_booking() {
		return time_of_booking;
	}
	public void setTime_of_booking(LocalDateTime time_of_booking) {
		this.time_of_booking = time_of_booking;
	}
	public int getNumber_of_seats() {
		return number_of_seats;
	}
	public void setNumber_of_seats(int number_of_seats) {
		this.number_of_seats = number_of_seats;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	public List<Slots> getSlots() {
		return slots;
	}
	public void setSlots(List<Slots> slots) {
		this.slots = slots;
	}
	
	
}

