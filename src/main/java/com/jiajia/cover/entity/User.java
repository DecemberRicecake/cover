package com.jiajia.cover.entity;

import java.util.Set;

public class User {
    private Integer id;

    private String username;

    private String password;

    private String mobile;

    private Set<UserHouse> houses;

    public User(Integer id, String username, String password, String mobile) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.mobile = mobile;
    }

    public Set<UserHouse> getHouses() { return houses; }

    public void setHouses(Set<UserHouse> houses) { this.houses = houses; }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }
}