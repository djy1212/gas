package com.gis.gas.domain.admissionapp;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
public class AdmissionApp extends BaseTimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String name;
    private String idNumber;
    private String phoneNumber;
    private String email;
    private String address;
    private String address2;
    private String zip;
    private String gender;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String selfIntroduce;

    @Builder
    public AdmissionApp(Long id, String name, String idNumber, String phoneNumber, String email, String address, String address2, String zip, String gender, String selfIntroduce) {
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

    public void update (String name, String idNumber, String phoneNumber, String email, String address, String address2, String zip, String gender, String selfIntroduce) {
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