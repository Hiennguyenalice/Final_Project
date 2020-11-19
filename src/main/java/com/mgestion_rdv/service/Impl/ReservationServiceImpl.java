package com.mgestion_rdv.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgestion_rdv.entity.Reservation;
import com.mgestion_rdv.repository.ReservationRepository;
import com.mgestion_rdv.service.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService{

	@Autowired
	 ReservationRepository  reservationRepository;
	
	@Override
	public  Reservation saveReservation( Reservation reservation) {
		
		return reservationRepository.save(reservation);
	}

	@Override
	public void deleteReservationById(Long id) {
		
		reservationRepository.deleteById(id);
	}

	@Override
	public Optional< Reservation> findReservationById(Long id) {
		
		return reservationRepository.findById(id);
	}

	@Override
	public  Reservation findReservation(Long id) {
		
		return reservationRepository.getOne(id);
	}

	@Override
	public List< Reservation> findReservations() {
		
		return reservationRepository.findAll();
	}
}
