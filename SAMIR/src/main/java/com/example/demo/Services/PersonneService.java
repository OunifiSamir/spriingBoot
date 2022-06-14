package com.example.demo.Services;

import java.util.List;

import com.example.demo.Entitie.Personne;






public interface PersonneService {

	List<Personne> retrieveAllPersonne();

	Personne addPersonne(Personne c);

	void deletePersonne(Long id);

	Personne updatePersonne(Personne c);

	Personne retrievePersonne(Long id);
	
	
	
	
}
