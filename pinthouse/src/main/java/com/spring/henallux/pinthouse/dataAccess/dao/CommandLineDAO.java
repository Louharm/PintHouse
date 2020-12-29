package com.spring.henallux.pinthouse.dataAccess.dao;

import com.spring.henallux.pinthouse.dataAccess.entity.CommandLineEntity;
import com.spring.henallux.pinthouse.dataAccess.util.ProviderConverter;
import com.spring.henallux.pinthouse.model.CommandLine;

public class CommandLineDAO implements CommandLineDataAccess {
    private ProviderConverter converter;

    public CommandLineDAO(ProviderConverter converter) {
        this.converter = converter;
    }

    @Override
    public void save(CommandLine commandLine) {
        CommandLineEntity commandLineEntity = converter.commandLineModelToEntity(commandLine);
    }
}
