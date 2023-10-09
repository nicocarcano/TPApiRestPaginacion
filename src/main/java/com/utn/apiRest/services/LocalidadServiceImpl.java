package com.utn.apiRest.services;

import com.utn.apiRest.entities.Localidad;
import com.utn.apiRest.repositories.BaseRepository;
import com.utn.apiRest.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService {

    @Autowired
    private LocalidadRepository localidadRepository;
    public LocalidadServiceImpl(BaseRepository<Localidad,Long> baseRepository){
        super(baseRepository);
    }

}
