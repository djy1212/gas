package com.gis.gas.domain.admissionapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AdmissionAppRepository extends JpaRepository<AdmissionApp, Long> {
    @Query("SELECT a FROM AdmissionApp a ORDER BY a.id DESC")
    List<AdmissionApp> findAllDesc();
}
