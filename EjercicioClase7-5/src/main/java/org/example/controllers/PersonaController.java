package org.example.controllers;

import org.example.entities.Persona;
import org.example.services.PersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")//permitimos el acceso a la API desde distintos origenes(clientes)
@RequestMapping(path = "api/v1/personas")
public class PersonaController {
    private PersonaService personaService;
    public PersonaController(PersonaService personaService){
        this.personaService=personaService;
    }

    @GetMapping("")
    public ResponseEntity<?> getAll(){//Este responseEntity no da la rta en formato JSON para nuestra app web
        try{
            return ResponseEntity.status(HttpStatus.OK).body(personaService.findAll());
        }catch (Exception e){//mensaje en formato JSON
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, intente mas tarde\"}");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(personaService.findById(id));
        }catch (Exception e){//mensaje en formato JSON
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, intente mas tarde\"}");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Persona entity){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(personaService.save(entity));
        }catch (Exception e){//mensaje en formato JSON
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, intente mas tarde\"}");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id,@RequestBody Persona entity){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(personaService.update(id, entity));
        }catch (Exception e){//mensaje en formato JSON
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, intente mas tarde\"}");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        try{
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(personaService.delete(id));
        }catch (Exception e){//mensaje en formato JSON
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, intente mas tarde\"}");
        }
    }














}
