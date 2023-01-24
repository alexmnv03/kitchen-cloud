package com.kitchen.clouddomainpostgresqldb.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.kitchen.cloudcommonpostgresqldb.entity.TacoOrderEntity;
import com.kitchen.cloudcommonpostgresqldb.entity.UserEntity;


public interface OrderRepository
        extends CrudRepository<TacoOrderEntity, Long> {

    List<TacoOrderEntity> findByUserOrderByPlacedAtDesc(
            UserEntity user, Pageable pageable);

}
