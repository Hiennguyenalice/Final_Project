package com.mgestion_rdv.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgestion_rdv.entity.Prestation;
import com.mgestion_rdv.repository.PrestationRepository;
import com.mgestion_rdv.service.PrestationService;

@Service
public class PrestationServiceImpl implements PrestationService{
	@Autowired
	PrestationRepository prestationRepository;
	
	@Override
	public Prestation savePrestation(Prestation prestation) {
		
		return prestationRepository.save(prestation);
	}

	@Override
	public void deletePrestationById(Long id) {
		
		prestationRepository.deleteById(id);
	}

	@Override
	public Optional<Prestation> findPrestationById(Long id) {
	
		return prestationRepository.findById(id);
	}

	@Override
	public Prestation findPrestation(Long id) {
		
		return prestationRepository.getOne(id);
	}

	@Override
	public List<Prestation> findPrestations() {
		
		return prestationRepository.findAll();
}
}
