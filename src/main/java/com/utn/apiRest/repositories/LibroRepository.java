package com.utn.apiRest.repositories;

import com.utn.apiRest.entities.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro,Long>{
}
