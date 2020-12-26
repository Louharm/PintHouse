package com.spring.henallux.pinthouse.dataAccess.util;

import com.spring.henallux.pinthouse.dataAccess.entity.BeerEntity;
import com.spring.henallux.pinthouse.model.*;
import com.spring.henallux.pinthouse.dataAccess.entity.CityEntity;
import com.spring.henallux.pinthouse.dataAccess.entity.CountryEntity;
import com.spring.henallux.pinthouse.dataAccess.entity.UserEntity;
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

    public BeerColor beerColorEntityToModel(BeerColorEntity beerColorEntity){
        return mapper.map(beerColorEntity, BeerColor.class);
    }

    public BeerType beerTypeEntityToModel(BeerTypeEntity beerTypeEntity){
        return mapper.map(beerTypeEntity, BeerType.class);
    }

    public Brewery breweryEntityToModel(BreweryEntity breweryEntity){
        Brewery brewery = mapper.map(breweryEntity, Brewery.class);
        return brewery;
    }

    public Country CountryEntityToModel(CountryEntity countryEntity){
        return mapper.map(countryEntity,Country.class);
    }

    public Beer BeerEntityToBeerModel(BeerEntity beerEntity){
        return mapper.map(beerEntity, Beer.class);
    }
}