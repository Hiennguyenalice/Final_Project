package com.mgestion_rdv.entity;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="prestation")
public class Prestation implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPrestation;
	private String nomPrestation;
	
	@ManyToOne
	@JoinColumn(name="reservation_fk", referencedColumnName="idReservation")
	private Reservation reservation; 

	public Prestation(Long idPrestation, String nomPrestation, Reservation reservation) {
		super();
		this.idPrestation = idPrestation;
		this.nomPrestation = nomPrestation;
		this.reservation = reservation;
	}


	public Prestation() {
		super();
	}


	public Long getIdPrestation() {
		return idPrestation;
	}


	public void setIdPrestation(Long idPrestation) {
		this.idPrestation = idPrestation;
	}


	public String getNomPrestation() {
		return nomPrestation;
	}


	public void setNomPrestation(String nomPrestation) {
		this.nomPrestation = nomPrestation;
	}


	public Reservation getReservation() {
		return reservation;
	}


	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}


	@Override
	public String toString() {
		return "Prestation [idPrestation=" + idPrestation + ", nomPrestation=" + nomPrestation + ", reservation="
				+ reservation + "]";
	}
	
	
}
