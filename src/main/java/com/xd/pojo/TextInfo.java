package com.xd.pojo;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;


public class TextInfo {
    private Long id;
    private String hospital;
    private String report_info;
    private String result;
    private String phone_num;
    private Date date;
    private int picture_type;
    private String items;
    private Long user_id;
    List<String> address;

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public int getPicture_type() {
        return picture_type;
    }

    public void setPicture_type(int picture_type) {
        this.picture_type = picture_type;
    }



    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getReport_info() {
        return report_info;
    }

    public void setReport_info(String report_info) {
        this.report_info = report_info;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(String date) {
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        java.sql.Date sDate = null;
        try {
            java.util.Date date3 = sdf2.parse(date);
            sDate = new java.sql.Date(date3.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.date = sDate;
    }

}
