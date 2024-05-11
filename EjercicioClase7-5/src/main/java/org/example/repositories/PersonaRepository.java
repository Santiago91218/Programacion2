package org.example.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.example.entities.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {
}