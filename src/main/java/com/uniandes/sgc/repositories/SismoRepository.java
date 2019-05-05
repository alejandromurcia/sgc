package com.uniandes.sgc.repositories;

import com.uniandes.sgc.models.Sismo;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;


@EnableScan
public interface SismoRepository extends CrudRepository<Sismo, String> {

    }