package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entitie.Personne;
import com.example.demo.Services.PersonneService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController                                   //bch tnjm tkhdem 3la postman 
@Api(tags = "PERSONNE management DHIA")          // pour le titre de swageer
@RequestMapping("/PersonneCRUD")                      // hadhi fi l url lfou9   1
public class PersonneController {
	
	@Autowired
	PersonneService perserv;    //1er etape
	
	
	
	@PostMapping("/add-client")
	@ApiOperation(value = "Ajouter un PERSONNE")
	@ResponseBody
	public Personne addpersonne(@RequestBody Personne c)
	{
		Personne client = perserv.addPersonne(c);
	return client;
	}
	
	
	
	
	
	
	@GetMapping("/retrieve-all")     // hadhi fil url ba3dha direct 2 
	@ApiOperation(value = "Récupérer la liste des personnes")    // hadhi titre mt3ha fi swagger
	@ResponseBody                                                    // hadhi resultat mte3ha fi l body
	public List<Personne> getPersonne(){
		List<Personne>  listepersonne = perserv.retrieveAllPersonne();                        //hadhi l selection
		return listepersonne;
				}
	
	
	
	
	
	
	

}
