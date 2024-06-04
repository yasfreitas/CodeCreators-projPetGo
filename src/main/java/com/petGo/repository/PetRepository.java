package com.petGo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petGo.entities.Pet;

public interface PetRepository extends JpaRepository<Pet, Long>{

}
