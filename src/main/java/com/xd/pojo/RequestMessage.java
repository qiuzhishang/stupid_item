package com.xd.pojo;

import java.util.List;

public class RequestMessage {

    private String phone_num;
    private int call_type;
    private DiseasePicture diseasePicture;
    private String token;
    private Sign sign;
    private Patient patient;
    private Report report;
    private PatientDiseaseInfo patientDiseaseInfo;
    private List<PatientDiseaseInfo> patientDiseaseInfoList;
    private OutPatient outPatient;
    private AdmissionNote admissionNote;
    private OutPatientRecords outPatientRecords;
    private String examine_info;



    public String getExamine_info() {
        return examine_info;
    }

    public void setExamine_info(String examine_info) {
        this.examine_info = examine_info;
    }

    public OutPatientRecords getOutPatientRecords() {
        return outPatientRecords;
    }

    public void setOutPatientRecords(OutPatientRecords outPatientRecords) {
        this.outPatientRecords = outPatientRecords;
    }

    public int getCall_type() {
        return call_type;
    }

    public void setCall_type(int call_type) {
        this.call_type = call_type;
    }

    @Override
    public String toString() {
        return "RequestMessage{" +
                "phone_num='" + phone_num + '\'' +
                ", pictureInfo=" + diseasePicture +
                ", token='" + token + '\'' +
                ", sign=" + sign +
                ", patient=" + patient +
                ", report=" + report +
                ", patientDiseaseInfo=" + patientDiseaseInfo +
                ", patientDiseaseInfoList=" + patientDiseaseInfoList +
                ", outPatient=" + outPatient +
                '}';
    }

    public AdmissionNote getAdmissionNote() {
        return admissionNote;
    }

    public void setAdmissionNote(AdmissionNote admissionNote) {
        this.admissionNote = admissionNote;
    }

    public OutPatient getOutPatient() {
        return outPatient;
    }

    public void setOutPatient(OutPatient outPatient) {
        this.outPatient = outPatient;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }

    public DiseasePicture getDiseasePicture() {
        return diseasePicture;
    }

    public void setDiseasePicture(DiseasePicture diseasePicture) {
        this.diseasePicture = diseasePicture;
    }

    public Sign getSign() {
        return sign;
    }

    public void setSign(Sign sign) {
        this.sign = sign;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public PatientDiseaseInfo getPatientDiseaseInfo() {
        return patientDiseaseInfo;
    }

    public void setPatientDiseaseInfo(PatientDiseaseInfo patientDiseaseInfo) {
        this.patientDiseaseInfo = patientDiseaseInfo;
    }

    public List<PatientDiseaseInfo> getPatientDiseaseInfoList() {
        return patientDiseaseInfoList;
    }

    public void setPatientDiseaseInfoList(List<PatientDiseaseInfo> patientDiseaseInfoList) {
        this.patientDiseaseInfoList = patientDiseaseInfoList;
    }

}
