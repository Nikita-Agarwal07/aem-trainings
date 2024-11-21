package com.trainingsite.core.models;

import java.util.List;

public class User {
    public void setRes(List<String> res) {
        this.res = res;
    }

    private List<String> res;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;

}
