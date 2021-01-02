package com.spring.henallux.pinthouse.dataAccess.util;

import com.spring.henallux.pinthouse.dataAccess.entity.*;
import com.spring.henallux.pinthouse.model.*;
import com.spring.henallux.pinthouse.model.Beer;
import com.spring.henallux.pinthouse.model.City;
import com.spring.henallux.pinthouse.model.Country;
import com.spring.henallux.pinthouse.model.User;
import org.dozer.Mapper;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

@Component
public class ProviderConverter {
    private Mapper mapper = new DozerBeanMapper();

    public UserEntity userModelToEntity(User user){
        UserEntity userEntity = mapper.map(user,UserEntity.class);
        userEntity.setAccountNonExpired(user.getAccountNonExpired());
        userEntity.setAccountNonLocked(user.getAccountNonLocked());
        userEntity.setCredentialsNonExpired(user.getCredentialsNonExpired());
        userEntity.setEnabled(user.getEnabled());
        userEntity.setAuthorities(user.getAuthoritiesString());
        return mapper.map(user,UserEntity.class);
    }
    public User userEntityToModel(UserEntity userEntity){
        User user = mapper.map(userEntity,User.class);
        user.setAccountNonExpired(userEntity.getAccountNonExpired());
        user.setAccountNonLocked(userEntity.getAccountNonLocked());
        user.setCredentialsNonExpired(userEntity.getCredentialsNonExpired());
        user.setEnabled(userEntity.getEnabled());
        user.setAuthorities(userEntity.getAuthorities());
        return user;
    }

    public CityEntity cityModelToEntity(City city){
        return mapper.map(city,CityEntity.class);
    }
    public City cityEntityToModel(CityEntity cityEntity){
        return mapper.map(cityEntity,City.class);
    }

    public CommandLineEntity commandLineModelToEntity(CommandLine commandLine){
        return mapper.map(commandLine, CommandLineEntity.class);
    }

    public BeerColor beerColorEntityToModel(TranslationBeerColorEntity beerColorEntity){
        return mapper.map(beerColorEntity, BeerColor.class);
    }

    public BeerType beerTypeEntityToModel(TranslationBeerTypeEntity translationEntity){
        return mapper.map(translationEntity, BeerType.class);
    }

    public Brewery breweryEntityToModel(TranslationBreweryEntity breweryEntity){
        Brewery brewery = mapper.map(breweryEntity, Brewery.class);
        return brewery;
    }

    public Country countryEntityToModel(TranslationCountryEntity translationCountryEntity){
        return mapper.map(translationCountryEntity,Country.class);
    }

    public Beer beerEntityToBeerModel(BeerEntity beerEntity, TranslationBeerTypeEntity translationBeerTypeEntity, TranslationBeerColorEntity beerColorEntity, TranslationBreweryEntity breweryEntity, TranslationCountryEntity countryEntity){
        Beer beer = mapper.map(beerEntity, Beer.class);
        beer.setBeerType(translationBeerTypeEntity.getName());
        beer.setBeerColor(beerColorEntity.getName());
        beer.setBrewery(breweryEntity.getName());
        beer.setCountry(countryEntity.getName());
        return beer;
    }
}