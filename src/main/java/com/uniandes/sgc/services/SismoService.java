package com.uniandes.sgc.services;

import com.uniandes.sgc.models.Sismo;
import com.uniandes.sgc.repositories.SismoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SismoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SismoService.class);

    @Autowired
    private SismoRepository sismoRepository;

    public Sismo saveSismo(Sismo sismoModel) {

        return sismoRepository.save(sismoModel);
    }
}