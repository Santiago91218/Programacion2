package org.example.services;
import org.example.entities.Persona;
import org.example.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements BaseService<Persona>{
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    @Transactional //van a ser transacciones con la BD
    public List<Persona> findAll() throws Exception {
        try{
            List<Persona> entities = personaRepository.findAll();//obtiene las perosnas de la BD
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona findById(Long id) throws Exception {
        try{
            //este metodo va obtener una entidad
            Optional<Persona> entity_optional=personaRepository.findById(id);
            return entity_optional.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona save(Persona entity) throws Exception {
        try{
            entity =personaRepository.save(entity);
            return entity;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona update(Long id, Persona entity) throws Exception {
        try{
            Optional<Persona> entity_optional=personaRepository.findById(id);
            Persona persona=entity_optional.get();
            persona =personaRepository.save(persona);
            return persona;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try{
            if(personaRepository.existsById(id)){
                personaRepository.deleteById(id);
                return true;
            }else{
                throw new Exception();
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}