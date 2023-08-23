package com.uspring.USpring.Service;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uspring.USpring.Entity.Persona;
import com.uspring.USpring.Repository.personaRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class personaService {

    @Autowired
    private final personaRepository personaRepository;

    @Transactional(readOnly = true)
    public List<Persona> getAllPersonas() {
        return (List<Persona>) personaRepository.findAll();
    }
    @Transactional
    public Persona savePersona(Persona Persona){
        return personaRepository.save(Persona);
    }
    @Transactional
    public Persona updatePersona(Persona Persona){
        return personaRepository.save(Persona);
    }
    @Transactional
    public void deletePersona(Persona persona){
        personaRepository.delete(persona);
    }
    @Transactional(readOnly = true)
    public Persona getById(Long id){ return personaRepository.findById(id).get(); }

}
