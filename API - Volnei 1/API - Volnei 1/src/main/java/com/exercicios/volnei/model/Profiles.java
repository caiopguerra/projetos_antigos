package com.exercicios.volnei.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profiles {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public UUID id;
	public String type;
	public String description;
	
	
	public Profiles() {
		super();
	}

	public UUID getId() {
		return id;
	}
	
	public void setId(UUID id) {
		this.id = id;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Profiles [id=" + id + ", type=" + type + ", description=" + description + "]";
	}
}
