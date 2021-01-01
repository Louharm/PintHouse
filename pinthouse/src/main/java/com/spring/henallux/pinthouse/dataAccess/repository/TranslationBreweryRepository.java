package com.spring.henallux.pinthouse.dataAccess.repository;

import com.spring.henallux.pinthouse.dataAccess.entity.TranslationBreweryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TranslationBreweryRepository extends JpaRepository<TranslationBreweryEntity, String> {
    List<TranslationBreweryEntity> findAllByLanguage(String language);
    TranslationBreweryEntity findByLanguageAndItem(String language, Integer item);
}