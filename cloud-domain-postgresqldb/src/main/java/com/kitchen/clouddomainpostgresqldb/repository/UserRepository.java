package com.kitchen.clouddomainpostgresqldb.repository;

import org.springframework.data.repository.CrudRepository;

import com.kitchen.cloudcommonpostgresqldb.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

    UserEntity findByUsername(String username);

}
