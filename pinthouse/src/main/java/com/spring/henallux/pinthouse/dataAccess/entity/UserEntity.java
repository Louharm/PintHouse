package com.spring.henallux.pinthouse.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

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

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumHouse(Integer numHouse) {
        this.numHouse = numHouse;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    public void setAccountNonExpired(Boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public void setAccountNonLocked(Boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public void setCredentialsNonExpired(Boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
