package com.softnerve.springbootmysql.entity;

import javax.persistence.*;

@Entity
@Table(name = "patient_info")
public class PatientInfoEntity {
    @Id
    @Column(unique=true)
    private Long patientId;
    private String patientName;
    private String patientConcatNo;

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientConcatNo() {
        return patientConcatNo;
    }

    public void setPatientConcatNo(String patientConcatNo) {
        this.patientConcatNo = patientConcatNo;
    }
}
