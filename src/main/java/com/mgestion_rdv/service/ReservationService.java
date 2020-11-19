package com.mgestion_rdv.service;

import java.util.List;
import java.util.Optional;

import com.mgestion_rdv.entity.Reservation;

public interface ReservationService {
	//Save & Update
			public Reservation saveReservation(Reservation reservation);
			//Delete
			public void deleteReservationById(Long id);
			//Find One By Id
			public Optional<Reservation> findReservationById(Long id);
			//Get One
			public Reservation findReservation(Long id);
			//Find All
			public List<Reservation> findReservations();
}
