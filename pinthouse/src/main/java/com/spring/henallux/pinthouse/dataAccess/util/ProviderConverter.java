package com.spring.henallux.pinthouse.dataAccess.util;

import com.spring.henallux.pinthouse.dataAccess.entity.UserEntity;
import com.spring.henallux.pinthouse.model.User;
import org.dozer.Mapper;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

@Component
public class ProviderConverter {
    private Mapper mapper = new DozerBeanMapper();

    public UserEntity userModelToUserEntity(User user){
        return mapper.map(user,UserEntity.class);
    }

    public User userEntityToUserModel(UserEntity userEntity){
        return mapper.map(userEntity,User.class);
    }
}