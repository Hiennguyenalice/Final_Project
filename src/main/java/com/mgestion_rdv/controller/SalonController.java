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

import com.mgestion_rdv.entity.Salon;
import com.mgestion_rdv.service.SalonService;

@CrossOrigin
@RestController
public class SalonController {
	@Autowired
	SalonService salonService;
	
	@PostMapping("/salons")
	public Salon saveOrUpdate(@RequestBody Salon salon) {
		return salonService.saveSalon(salon);
	}
	
	@DeleteMapping("/salons/{id}")
	public void deleteOneByID(@PathVariable("id") Long id) {
		salonService.deleteSalonById(id);
	}
	
	@GetMapping("/salons/{id}")
	public Optional<Salon> findOneById(@PathVariable("id") Long id){
		return salonService.findSalonById(id);
	}
	
	@GetMapping("/salons")
	public List<Salon> findAll(){
		return salonService.findSalons();
	}
	
	@PutMapping("/salons/{id}")
	public Salon update(@PathVariable("id") Long id ,@RequestBody Salon salon) {
		Salon current = salonService.findSalon(id);
		current.setIdSalon(salon.getIdSalon());
		current.setNomSalon(salon.getNomSalon());
		current.setAdresseSalon(salon.getAdresseSalon());
		return salonService.saveSalon(current);
	}
}
