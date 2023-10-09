package com.utn.apiRest.services;

import com.utn.apiRest.entities.Libro;
import com.utn.apiRest.repositories.BaseRepository;
import com.utn.apiRest.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro,Long> implements LibroService{

    @Autowired
    private LibroRepository libroRepository;
    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository) {
        super(baseRepository);
    }
}
