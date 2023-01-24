package com.kitchen.clouddomainpostgresqldb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.kitchen.cloudcommonpostgresqldb.entity.IngredientEntity;

@CrossOrigin(origins="http://localhost:8080")
public interface IngredientRepository
        extends CrudRepository<IngredientEntity, String> {

}
