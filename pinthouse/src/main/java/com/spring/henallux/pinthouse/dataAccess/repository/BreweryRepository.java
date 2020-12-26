package com.spring.henallux.pinthouse.dataAccess.repository;

import com.spring.henallux.pinthouse.dataAccess.entity.BreweryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreweryRepository  extends JpaRepository<BreweryEntity, String> {
}
