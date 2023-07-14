package com.cuadros.Restfulls8.Carrera;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "carrera",path = "carrera")
public interface CarreraRepository extends PagingAndSortingRepository<Carrera,Integer>, CrudRepository<Carrera,Integer>{
    
    List<Carrera> findByNombre(@Param("nombre") String nombre);
}

