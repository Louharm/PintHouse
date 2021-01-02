package com.spring.henallux.pinthouse.dataAccess.repository;

import com.spring.henallux.pinthouse.dataAccess.entity.TranslationCountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TranslationCountryRepository extends JpaRepository<TranslationCountryEntity, String> {
    List<TranslationCountryEntity> findAllByLanguage(String language);
    TranslationCountryEntity findByLanguageAndItem(String language, Integer item);
}
