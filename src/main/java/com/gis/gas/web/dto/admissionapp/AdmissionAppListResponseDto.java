package com.gis.gas.web.dto.admissionapp;

import com.gis.gas.domain.admissionapp.AdmissionApp;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class AdmissionAppListResponseDto {
    private Long id;
    private String name;
    private String email;
    private LocalDateTime modifiedDate;

    public AdmissionAppListResponseDto(AdmissionApp entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.email = entity.getEmail();
        this.modifiedDate = entity.getModifiedDate();
    }
}