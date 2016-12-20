package com.ffp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ffp.entities.Provincia;

//@Repository
public interface ProvinciaRepository extends JpaRepository<Provincia,Long>{

}
