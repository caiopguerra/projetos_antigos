package com.exercicios.volnei.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.exercicios.volnei.record.DadosClient;
import com.exercicios.volnei.record.DadosPutClient;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	
	public double cpf;
	public int birthday;
	public String firstName;
	public String lastName;
	public int phone;
	public String email;
	public String password;
	public Date createdAt;
	public Long profilesId;
	


	public Client() {
		super();
	}

	public Client(DadosClient dados) {
        this.firstName = dados.firstName();
        this.lastName = dados.lastName();
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public double getCpf() {
		return cpf;
	}
	
	public void setCpf(double cpf) {
		this.cpf = cpf;
	}
	
	public int getBirthday() {
		return birthday;
	}
	
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public void setLast_name(String lastName) {
		this.lastName = lastName;
	}
	
	public double getPhone() {
		return phone;
	}
	
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Date getCreatedAt() {
		return createdAt;
	}
	
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	public Long getProfilesId() {
		return profilesId;
	}
	
	public void setProfiles_id(Long profilesId) {
		this.profilesId = profilesId;
	}
	
	@Override
	public String toString() {
		return "Client [id=" + id + ", cpf=" + cpf + ", birthday=" + birthday + ", first_name=" + firstName
				+ ", last_name=" + lastName + ", phone=" + phone + ", email=" + email + ", password=" + password
				+ ", created_at=" + createdAt + ", profiles_id=" + profilesId + "]";
	}

	public void atualizarDados(DadosClient dados) {

		 if (dados.firstName() != null) {
	            this.firstName = dados.firstName();
	        }
		
		 if (dados.lastName() != null) {
	            this.lastName = dados.lastName();
	        }
	}
}
