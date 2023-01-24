package com.kitchen.clouddomainpostgresqldb.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.kitchen.cloudcommonpostgresqldb.entity.TacoEntity;

public interface TacoRepository
        extends PagingAndSortingRepository<TacoEntity, Long> {

}
