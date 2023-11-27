package org.travels.registeration.Dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Bus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name;
	@Column (name = "depature_time")
	private String deptime;
	@Column(nullable = false,unique = true)
	private String busnum;
	@Column(nullable = false,name="from_loc")
	private String from;
	@Column(nullable = false, name="to_loc")
	private String to;
	@Column(nullable = false,name="date_of_registeration")
	private LocalDate dor;
	@Column(nullable = false,name="number_of_seats" )
	private int nos;
	@Column (name = "destination_time")
	private String destime;
	private String journey_hrs;
	private String category;
	private String imageurl;
	@ManyToOne
	@JoinColumn
	@JsonIgnore
	private Admin admin;
	@OneToMany(mappedBy = "bus")
	private List<Ticket> tickets;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeptime() {
		return deptime;
	}
	public void setDeptime(String deptime) {
		this.deptime = deptime;
	}
	public String getBusnum() {
		return busnum;
	}
	public void setBusnum(String busnum) {
		this.busnum = busnum;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public LocalDate getDor() {
		return dor;
	}
	public void setDor(LocalDate dor) {
		this.dor = dor;
	}
	public int getNos() {
		return nos;
	}
	public void setNos(int nos) {
		this.nos = nos;
	}
	public String getDestime() {
		return destime;
	}
	public void setDestime(String destime) {
		this.destime = destime;
	}
	public String getJourney_hrs() {
		return journey_hrs;
	}
	public void setJourney_hrs(String journey_hrs) {
		this.journey_hrs = journey_hrs;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public List<Ticket> getTickets() {
		return tickets;
	}
	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	
}
