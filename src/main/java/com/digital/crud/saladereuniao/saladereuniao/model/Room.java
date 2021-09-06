package com.digital.crud.saladereuniao.saladereuniao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="meetingroom")
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String date;
	
	@Column(nullable = false)
	private String startHour;
	
	@Column(nullable = false)
	private String endHour;
	
	
	public Room() {
		
	}
	
	
	public Room(Long id, String name, String date, String startHour, String endHour) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.startHour = startHour;
		this.endHour = endHour;
	}


	public Long getId() {
		return id;
	}
	

	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDate() {
		return date;
	}
	

	public void setDate(String date) {
		this.date = date;
	}


	public String getStartHour() {
		return startHour;
	}


	public void setStartHour(String startHour) {
		this.startHour = startHour;
	}


	public String getEndHour() {
		return endHour;
	}


	public void setEndHour(String endHour) {
		this.endHour = endHour;
	}
	

	@Override
	public String toString() {
		return String.format(
			"Room [id=%d, name=%s, date=%s, startHour=%s, endHour=%s]", 
			id, name, date, startHour, endHour
		);
	}
}