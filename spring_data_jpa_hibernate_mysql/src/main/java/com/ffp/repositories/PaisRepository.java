package com.ffp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ffp.entities.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais,Long> {

}
