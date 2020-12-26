package com.spring.henallux.pinthouse.dataAccess.repository;

import com.spring.henallux.pinthouse.dataAccess.entity.BeerTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeerTypeRepository  extends JpaRepository<BeerTypeEntity, String> {
}
