package com.xd.pojo;

import java.util.Date;
import java.util.List;

public class DiseasePicture {
    private Long id;
    private String file_addr;
    private Date date;
    private int picture_type;
    private Long user_id;
    private List<String> address;

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "DiseasePicture{" +
                "file_addr='" + file_addr + '\'' +
                ", date=" + date +
                ", picture_type=" + picture_type +
                ", uer_id=" + user_id +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFile_addr() {
        return file_addr;
    }

    public void setFile_addr(String file_addr) {
        this.file_addr = file_addr;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPicture_type() {
        return picture_type;
    }

    public void setPicture_type(int picture_type) {
        this.picture_type = picture_type;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
}
