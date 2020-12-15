package com.spring.henallux.pinthouse.dataAccess.repository;

import com.spring.henallux.pinthouse.dataAccess.entity.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<CountryEntity, String> {
    CountryEntity findByNameFR(String name);
}
