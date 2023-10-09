package com.utn.apiRest.repositories;

import com.utn.apiRest.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long>{
    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);

    @Query(value = "Select p FROM Persona p WHERE p.nombre LIKE '%?2%' OR p.apellido LIKE '%?1%'")
    List<Persona> search(String filtro);

    @Query(value = "Select p FROM Persona p WHERE p.nombre LIKE '%?2%' OR p.apellido LIKE '%?1%'")
    Page<Persona> search(String filtro,Pageable pageable);

    @Query(
            value = "Select * FROM persona  WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
            nativeQuery = true
    )


    List<Persona> searchNativo(@Param("filtro") String filtro);

    @Query(
            value = "Select * FROM persona  WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
            countQuery = "SELECT count(*) FROM persona",
            nativeQuery = true
    )


    Page<Persona> searchNativo(@Param("filtro") String filtro,Pageable pageable);
}
