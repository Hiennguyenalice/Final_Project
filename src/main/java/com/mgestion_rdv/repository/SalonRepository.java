package com.mgestion_rdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mgestion_rdv.entity.Salon;

@Repository
public interface SalonRepository extends JpaRepository<Salon, Long>{

}
