package com.yshen.pojo;

import org.springframework.data.relational.core.mapping.Table;

@Table("Good")

public class Good {
    private String g_name;
    private String g_photo;//保存图片的路径
    private String g_describe;
    private float g_price;
    private int g_number;//库存\

    public String getG_name() {
        return g_name;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }

    public String getG_photo() {
        return g_photo;
    }

    public void setG_photo(String g_photo) {
        this.g_photo = g_photo;
    }

    public String getG_describe() {
        return g_describe;
    }

    public void setG_describe(String g_describe) {
        this.g_describe = g_describe;
    }

    public float getG_price() {
        return g_price;
    }

    public void setG_price(float g_price) {
        this.g_price = g_price;
    }

    public int getG_number() {
        return g_number;
    }

    public void setG_number(int g_number) {
        this.g_number = g_number;
    }
}
