package com.gis.gas.web.dto.admissionapp;

import com.gis.gas.domain.admissionapp.AdmissionApp;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class AdmissionAppResponseDto {

    private Long id;
    private String name;
    private String idNumber;
    private String phoneNumber;
    private String email;
    private String address;
    private String address2;
    private String zip;
    private String gender;
    private String selfIntroduce;

    public AdmissionAppResponseDto(AdmissionApp entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.idNumber = entity.getIdNumber();
        this.phoneNumber = entity.getPhoneNumber();
        this.email = entity.getEmail();
        this.address = entity.getAddress();
        this.address2 = entity.getAddress2();
        this.zip = entity.getZip();
        this.gender = entity.getGender();
        this.selfIntroduce = entity.getSelfIntroduce();
    }
}
