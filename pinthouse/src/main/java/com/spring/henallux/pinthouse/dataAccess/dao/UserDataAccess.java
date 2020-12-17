package com.spring.henallux.pinthouse.dataAccess.dao;

import com.spring.henallux.pinthouse.model.User;

public interface UserDataAccess {
    void save(User user);
    User findByUsername(String username);
}
