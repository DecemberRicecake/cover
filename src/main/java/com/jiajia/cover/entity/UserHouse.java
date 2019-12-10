package com.jiajia.cover.entity;

public class UserHouse {
    private Integer id;

    private Integer userid;

    private String address;

    private Integer city;

    private String houseAge;

    public UserHouse(Integer id, Integer userid, String address, Integer city, String houseAge) {
        this.id = id;
        this.userid = userid;
        this.address = address;
        this.city = city;
        this.houseAge = houseAge;
    }

    public UserHouse() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public String getHouseAge() {
        return houseAge;
    }

    public void setHouseAge(String houseAge) {
        this.houseAge = houseAge == null ? null : houseAge.trim();
    }
}