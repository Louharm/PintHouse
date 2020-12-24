package com.spring.henallux.pinthouse.dataAccess.util;

import com.spring.henallux.pinthouse.dataAccess.entity.CityEntity;
import com.spring.henallux.pinthouse.dataAccess.entity.CountryEntity;
import com.spring.henallux.pinthouse.dataAccess.entity.UserEntity;
import com.spring.henallux.pinthouse.model.City;
import com.spring.henallux.pinthouse.model.Country;
import com.spring.henallux.pinthouse.model.User;
import org.dozer.Mapper;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

@Component
public class ProviderConverter {
    private Mapper mapper = new DozerBeanMapper();

    public UserEntity userModelToUserEntity(User user){
        UserEntity userEntity = mapper.map(user,UserEntity.class);
        userEntity.setAccountNonExpired(user.getAccountNonExpired());
        userEntity.setAccountNonLocked(user.getAccountNonLocked());
        userEntity.setCredentialsNonExpired(user.getCredentialsNonExpired());
        userEntity.setEnabled(user.getEnabled());
        userEntity.setAuthorities(user.getAuthoritiesString());
        return mapper.map(user,UserEntity.class);
    }
    public User userEntityToUserModel(UserEntity userEntity){
        User user = mapper.map(userEntity,User.class);
        user.setAccountNonExpired(userEntity.getAccountNonExpired());
        user.setAccountNonLocked(userEntity.getAccountNonLocked());
        user.setCredentialsNonExpired(userEntity.getCredentialsNonExpired());
        user.setEnabled(userEntity.getEnabled());
        user.setAuthorities(userEntity.getAuthorities());
        return user;
    }

    public CityEntity cityModelToCityEntity(City city){
        return mapper.map(city,CityEntity.class);
    }
    public City cityEntityToCityModel(CityEntity cityEntity){
        return mapper.map(cityEntity,City.class);
    }

    public Country CountryEntityToCountryModel(CountryEntity countryEntity){
        return mapper.map(countryEntity,Country.class);
    }
}