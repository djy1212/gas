package com.gis.gas.web.dto.admissionapp;

import com.gis.gas.domain.admissionapp.AdmissionApp;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class AdmissionAppUpdateRequestDto {

    private String name;
    private String idNumber;
    private String phoneNumber;
    private String email;
    private String address;
    private String address2;
    private String zip;
    private String gender;
    private String selfIntroduce;

    @Builder
    public AdmissionAppUpdateRequestDto( String name, String idNumber, String phoneNumber, String email, String address, String address2, String zip, String gender, String selfIntroduce) {
        this.name = name;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.address2 = address2;
        this.zip = zip;
        this.gender = gender;
        this.selfIntroduce = selfIntroduce;
    }
}
