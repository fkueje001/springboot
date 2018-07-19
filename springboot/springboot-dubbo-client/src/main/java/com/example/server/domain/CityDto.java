package com.example.server.domain;

import java.io.Serializable;

/**
 * @author : nangua
 * date:   2018-07-19 17:56
 * @description:
 */
public class CityDto implements Serializable {
    private String name;

    private String address;

    public CityDto(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
