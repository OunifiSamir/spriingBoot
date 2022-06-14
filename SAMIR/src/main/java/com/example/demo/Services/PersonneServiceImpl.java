package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entitie.Personne;
import com.example.demo.Repository.PersonneRepository;





@Service    //1er etape
public class PersonneServiceImpl implements PersonneService {
	
	@Autowired
	PersonneRepository perREP;  //2em etape
	
	
	

	@Override
	public List<Personne> retrieveAllPersonne() {
		
		return (List<Personne>) perREP.findAll();
	}

	@Override
	public Personne addPersonne(Personne c) {
		
		perREP.save(c);
		return c;
	}

	@Override
	public void deletePersonne(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Personne updatePersonne(Personne c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personne retrievePersonne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
