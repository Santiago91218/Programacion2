package org.example.services;
import java.util.List;
public interface BaseService <E> {
    public List<E> findAll() throws Exception;//trae todas las entidades
    public E findById(Long id) throws Exception;//trae una entidad con el id
    public E save(E entity) throws Exception;//crea una entidad
    public E update(Long id,E entity) throws Exception;//actualiza una entidad desde el id
    public boolean delete(Long id) throws Exception;//elimina con el id
}