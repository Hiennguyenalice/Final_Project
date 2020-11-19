package com.mgestion_rdv.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgestion_rdv.entity.Salon;
import com.mgestion_rdv.repository.SalonRepository;
import com.mgestion_rdv.service.SalonService;

@Service
public class SalonServiceImpl implements SalonService {
	@Autowired
	SalonRepository salonRepository;
	
	@Override
	public Salon saveSalon(Salon salon) {
		
		return salonRepository.save(salon);
	}

	@Override
	public void deleteSalonById(Long id) {
		
		salonRepository.deleteById(id);
	}

	@Override
	public Optional<Salon> findSalonById(Long id) {
		
		return salonRepository.findById(id);
	}

	@Override
	public Salon findSalon(Long id) {
		
		return salonRepository.getOne(id);
	}

	@Override
	public List<Salon> findSalons() {
		
		return salonRepository.findAll();
	}
}

