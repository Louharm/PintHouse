package com.spring.henallux.pinthouse.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity(name="user")
public class UserEntity {
    @Id
    @Column(name = "id")
    private Integer idUser;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String username;

    @Column(name = "birthdate")
    private Date birthDate;

    @Column(name = "street")
    private String street;

    @Column(name = "numhouse")
    private Integer numHouse;

    @Column(name = "phonenumber")
    private String phoneNumber;

    @Column(name = "cityid")
    private Integer cityId;

    @Column(name = "authorities")
    private String authorities;

    @Column(name = "non_expired")
    private Boolean accountNonExpired;

    @Column(name = "non_locked")
    private Boolean accountNonLocked;

    @Column(name = "credentials_non_expired")
    private Boolean credentialsNonExpired;

    @Column(name = "enabled")
    private Boolean enabled;

    public UserEntity() {
    }

    public Integer getIdUser() {
        return idUser;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getStreet() {
        return street;
    }

    public Integer getNumHouse() {
        return numHouse;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getCityId() {
        return cityId;
    }

    public String getAuthorities() {
        return authorities;
    }

    public Boolean getAccountNonExpired() {
        return accountNonExpired;
    }

    public Boolean getAccountNonLocked() {
        return accountNonLocked;
    }

    public Boolean getCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public Boolean getEnabled() {
        return enabled;
    }
}
