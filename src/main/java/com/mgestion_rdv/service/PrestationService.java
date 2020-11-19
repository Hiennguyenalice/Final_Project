package com.mgestion_rdv.service;

import java.util.List;
import java.util.Optional;

import com.mgestion_rdv.entity.Prestation;

public interface PrestationService {
	//Save & Update
			public Prestation savePrestation(Prestation prestation);
			//Delete
			public void deletePrestationById(Long id);
			//Find One By Id
			public Optional<Prestation> findPrestationById(Long id);
			//Get One
			public Prestation findPrestation(Long id);
			//Find All
			public List<Prestation> findPrestations();
}
