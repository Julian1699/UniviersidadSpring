package com.uspring.USpring.Repository;

import com.uspring.USpring.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personaRepository extends JpaRepository<Persona,Long> {

}
