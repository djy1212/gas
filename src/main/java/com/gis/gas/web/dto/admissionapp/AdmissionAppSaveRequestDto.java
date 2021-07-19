package com.gis.gas.web.dto.admissionapp;

import com.gis.gas.domain.admissionapp.AdmissionApp;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AdmissionAppSaveRequestDto {
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

    @Builder
    public AdmissionAppSaveRequestDto(Long id, String name, String idNumber, String phoneNumber, String email, String address, String address2, String zip, String gender, String selfIntroduce) {
        this.id = id;
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

    public AdmissionApp toEntity(){
        return  AdmissionApp.builder()
                .name(name)
                .idNumber(idNumber)
                .phoneNumber(phoneNumber)
                .email(email)
                .address(address)
                .address2(address2)
                .zip(zip)
                .gender(gender)
                .selfIntroduce(selfIntroduce)
                .build();
    }
}
