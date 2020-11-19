package com.mgestion_rdv.service;

import java.util.List;
import java.util.Optional;

import com.mgestion_rdv.entity.Salon;

public interface SalonService {
	//Save & Update
			public Salon saveSalon(Salon salon);
			//Delete
			public void deleteSalonById(Long id);
			//Find One By Id
			public Optional<Salon> findSalonById(Long id);
			//Get One
			public Salon findSalon(Long id);
			//Find All
			public List<Salon> findSalons();
}
