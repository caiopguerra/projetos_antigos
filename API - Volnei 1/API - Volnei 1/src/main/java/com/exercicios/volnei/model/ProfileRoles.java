package com.exercicios.volnei.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProfileRoles {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public UUID id;
	public UUID profileId;
	public UUID roleId;
	
	
	public ProfileRoles() {
		super();
	}

	public UUID getId() {
		return id;
	}
	
	public void setId(UUID id) {
		this.id = id;
	}
	
	public UUID getProfileId() {
		return profileId;
	}
	
	public void setProfile_id(UUID profileId) {
		this.profileId = profileId;
	}
	
	public UUID getRoleId() {
		return roleId;
	}
	
	public void setRole_id(UUID roleId) {
		this.roleId = roleId;
	}
	
	
	@Override
	public String toString() {
		return "ProfileRoles [id=" + id + ", profile_id=" + profileId + ", role_id=" + roleId + "]";
	}
}
