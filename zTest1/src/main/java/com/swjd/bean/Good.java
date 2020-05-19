package com.swjd.bean;

import org.springframework.format.annotation.DateTimeFormat;

import javax.xml.crypto.Data;

public class Good {
    private Integer id;
    private String name;
    private float price;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Data date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Data getDate() {
        return date;
    }

    public void setDate(Data date) {
        this.date = date;
    }
}
