package com.spring.henallux.pinthouse.dataAccess.repository;

import com.spring.henallux.pinthouse.dataAccess.entity.TranslationBeerColorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TranslationBeerColorRepository extends JpaRepository<TranslationBeerColorEntity, String> {
    List<TranslationBeerColorEntity> findAllByLanguage(String language);
    TranslationBeerColorEntity findByLanguageAndItem(String language, Integer item);
}
