package com.mahesh504.recycleview_sample.model;

public class PropertyModel {

    private int pro_id;
    private String pro_name;
    private String pro_adrs;
    private String pro_image;

    public PropertyModel(int pro_id, String pro_name, String pro_adrs, String pro_image) {
        this.pro_id = pro_id;
        this.pro_name = pro_name;
        this.pro_adrs = pro_adrs;
        this.pro_image = pro_image;
    }

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public String getPro_adrs() {
        return pro_adrs;
    }

    public void setPro_adrs(String pro_adrs) {
        this.pro_adrs = pro_adrs;
    }

    public String getPro_image() {
        return pro_image;
    }

    public void setPro_image(String pro_image) {
        this.pro_image = pro_image;
    }
}
