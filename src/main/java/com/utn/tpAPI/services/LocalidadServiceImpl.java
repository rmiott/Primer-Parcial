package com.utn.tpAPI.services;

import com.utn.tpAPI.entities.Localidad;
import com.utn.tpAPI.repositories.BaseRepository;
import com.utn.tpAPI.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{
    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository, LocalidadRepository localidadRepository){
        super(baseRepository);
        this.localidadRepository = localidadRepository;
    }
}