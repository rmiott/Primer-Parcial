package com.utn.tpAPI.services;

import com.utn.tpAPI.entities.Autor;
import com.utn.tpAPI.repositories.AutorRepository;
import com.utn.tpAPI.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{
    @Autowired
    private AutorRepository autorRepository;
    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository, AutorRepository autorRepository) {

        super(baseRepository);
        this.autorRepository = autorRepository;
    }
}