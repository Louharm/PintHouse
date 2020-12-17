package com.spring.henallux.pinthouse;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GetPassword {
    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String password = bCryptPasswordEncoder.encode("password");
        System.out.println(password);
    }
}
