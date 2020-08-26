package com.xd.pojo;

//门诊病历
public class OutPatient {
    private long id;
    private String date;//日期
    private String department_treatment;//就诊科室
    private String hospital;//就诊医院
    private String disease_info;//病历内容
    private String doctor_name;//医生名字

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    private String phone_num;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDepartment_treatment() {
        return department_treatment;
    }

    public void setDepartment_treatment(String department_treatment) {
        this.department_treatment = department_treatment;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getDisease_info() {
        return disease_info;
    }

    public void setDisease_info(String disease_info) {
        this.disease_info = disease_info;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    @Override
    public String toString() {
        return "OutPatient{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", department_treatment='" + department_treatment + '\'' +
                ", hospital='" + hospital + '\'' +
                ", disease_info='" + disease_info + '\'' +
                ", phone_num='" + phone_num + '\'' +
                '}';
    }
}
