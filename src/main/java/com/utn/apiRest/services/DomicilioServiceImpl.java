package com.utn.apiRest.services;

import com.utn.apiRest.entities.Domicilio;
import com.utn.apiRest.repositories.BaseRepository;
import com.utn.apiRest.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio,Long> implements DomicilioService {

    @Autowired
    private DomicilioRepository domicilioRepository;
    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository) {
        super(baseRepository);
    }
}
