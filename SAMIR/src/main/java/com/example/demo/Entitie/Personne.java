package com.example.demo.Entitie;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity

public class Personne implements Serializable {

	public enum Role  {

		scrum_master,
		product_owner,
		developer,
		client
		  
	}
	
	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)   //auto incremente 
	private Long id;
		
	
	private String nom;
	private String email;
	private Date Dnaaisance;
	private Role rolepersonne;
	
	
	
	
	
	
	//gettre and setter
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDnaaisance() {
		return Dnaaisance;
	}
	public void setDnaaisance(Date dnaaisance) {
		Dnaaisance = dnaaisance;
	}
	
	
	
	public Role getRolepersonne() {
		return rolepersonne;
	}
	public void setRolepersonne(Role rolepersonne) {
		this.rolepersonne = rolepersonne;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
