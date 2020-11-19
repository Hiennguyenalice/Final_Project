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

import com.mgestion_rdv.entity.Reservation;
import com.mgestion_rdv.service.ReservationService;

@CrossOrigin
@RestController
public class ReservationController {
	@Autowired
	ReservationService reservationService;
	
	
		@PostMapping("/reservations")
		public Reservation saveOrUpdate(@RequestBody Reservation reservation) {
			return reservationService.saveReservation(reservation);
		}
		
		@DeleteMapping("/reservations/{id}")
		public void deleteOneByID(@PathVariable("id") Long id) {
			reservationService.deleteReservationById(id);
		}
		
		@GetMapping("/reservations/{id}")
		public Optional<Reservation> findOneById(@PathVariable("id") Long id){
			return reservationService.findReservationById(id);
		}
		
		@GetMapping("/reservations")
		public List<Reservation> findAll(){
			return reservationService.findReservations();
		}
		
		@PutMapping("/reservations/{id}")
		public Reservation update(@PathVariable("id") Long id ,@RequestBody Reservation reservation) {
			Reservation current = reservationService.findReservation(id);
			current.setIdReservation(reservation.getIdReservation());
			current.setDateReservation(reservation.getDateReservation());
			return reservationService.saveReservation(current);
		}
		
}
