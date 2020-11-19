package com.mgestion_rdv.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mgestion_rdv.entity.Prestation;
import com.mgestion_rdv.service.PrestationService;

@CrossOrigin
@RestController
public class PrestationController {
	@Autowired
	PrestationService prestationService;

	@PostMapping("/prestations")
	public Prestation saveOrUpdate(@RequestBody Prestation prestation) {
		return prestationService.savePrestation(prestation);
	}
	
	@DeleteMapping("/prestations/{id}")
	public void deleteOneByID(@PathVariable("id") Long id) {
		prestationService.deletePrestationById(id);
	}
	
	@GetMapping("/prestations/{id}")
	public Optional<Prestation> findOneById(@PathVariable("id") Long id){
		return prestationService.findPrestationById(id);
	}
	
	@GetMapping("/prestations")
	public List<Prestation> findAll(){
		return prestationService.findPrestations();
	}
	
	@PutMapping("/prestations/{id}")
	public Prestation update(@PathVariable("id") Long id ,@RequestBody Prestation prestation) {
		Prestation current = prestationService.findPrestation(id);
		current.setIdPrestation(prestation.getIdPrestation());
		current.setNomPrestation(prestation.getNomPrestation());
		return prestationService.savePrestation(current);
	}
}

