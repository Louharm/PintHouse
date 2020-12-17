package com.spring.henallux.pinthouse.dataAccess.dao;

import com.spring.henallux.pinthouse.dataAccess.entity.UserEntity;
import com.spring.henallux.pinthouse.dataAccess.repository.UserRepository;
import com.spring.henallux.pinthouse.dataAccess.util.ProviderConverter;
import com.spring.henallux.pinthouse.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserDAO implements UserDataAccess {
    private UserRepository userRepository;
    private ProviderConverter converter;

    @Autowired
    public UserDAO(UserRepository userRepository, ProviderConverter converter){
        this.userRepository = userRepository;
        this.converter = converter;
    }

    public void save(User user){
        UserEntity userEntity = converter.userModelToUserEntity(user);
        userRepository.save(userEntity);
    }
    public User findByUsername(String username){
        UserEntity userEntity = userRepository.findByUsername(username);
        return converter.userEntityToUserModel(userEntity);
    }
}
