package com.spring.henallux.pinthouse.dataAccess.repository;

import com.spring.henallux.pinthouse.dataAccess.entity.CommandLineEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandLineRepository extends JpaRepository<CommandLineEntity, String> {
    @Override
    <S extends CommandLineEntity> S save(S s);
}
