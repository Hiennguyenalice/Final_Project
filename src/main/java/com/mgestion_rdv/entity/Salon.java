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
@Table(name="salon")
public class Salon implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSalon;
	private String nomSalon;
	private String adresseSalon;
	private String phonenumber;
	
	@ManyToOne
	@JoinColumn(name="reservation_fk", referencedColumnName="idReservation")
	private Reservation reservation; 

	public Salon(Long idSalon, String nomSalon, String adresseSalon, String phonenumber, Reservation reservation) {
		super();
		this.idSalon = idSalon;
		this.nomSalon = nomSalon;
		this.adresseSalon = adresseSalon;
		this.phonenumber = phonenumber;
		this.reservation = reservation;
	}

	public Salon() {
		super();
	}

	public Long getIdSalon() {
		return idSalon;
	}

	public void setIdSalon(Long idSalon) {
		this.idSalon = idSalon;
	}

	public String getNomSalon() {
		return nomSalon;
	}

	public void setNomSalon(String nomSalon) {
		this.nomSalon = nomSalon;
	}

	public String getAdresseSalon() {
		return adresseSalon;
	}

	public void setAdresseSalon(String adresseSalon) {
		this.adresseSalon = adresseSalon;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	@Override
	public String toString() {
		return "Salon [idSalon=" + idSalon + ", nomSalon=" + nomSalon + ", adresseSalon=" + adresseSalon
				+ ", phonenumber=" + phonenumber + ", reservation=" + reservation + "]";
	}
	
	

}
