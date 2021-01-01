package com.spring.henallux.pinthouse.dataAccess.repository;

import com.spring.henallux.pinthouse.dataAccess.entity.TranslationBeerTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TranslationBeerTypeRepository extends JpaRepository<TranslationBeerTypeEntity, String> {
    List<TranslationBeerTypeEntity> findAllByLanguage(String language);
    TranslationBeerTypeEntity findByLanguageAndItem(String language, Integer item);
}
