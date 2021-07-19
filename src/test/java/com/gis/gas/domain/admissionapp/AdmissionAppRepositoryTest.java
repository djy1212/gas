package com.gis.gas.domain.admissionapp;

import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class AdmissionAppRepositoryTest {

    @Autowired
    AdmissionAppRepository admissionAppRepository;

    @After
    public void cleanup() {
        admissionAppRepository.deleteAll();
    }

    @Test
    public void 게시글저장_불러오기() {
        //given
        String author = "192.122.432.222";
        String name = "동하민";
        String idNumber = "20000003000000";
        String phoneNumber = "01000000000";
        String email = "dhm@gmail.com";
        String address = "세종시 소담로";
        String address2 = "123-1";
        String zip = "61181";
        String gender = "male";
        String selfIntroduce = "저는 동하민입니다.";

        LocalDateTime localDateTime = LocalDateTime.now();

        admissionAppRepository.save(AdmissionApp.builder()
                .author(author)
                .name(name)
                .idNumber(idNumber)
                .phoneNumber(phoneNumber)
                .email(email)
                .address(address)
                .address2(address2)
                .zip(zip)
                .gender(gender)
                .selfIntroduce(selfIntroduce)
                .createAt(localDateTime)
                .updatedAt(localDateTime)
                .build());
        //when
        List<AdmissionApp> admissionAppsList = admissionAppRepository.findAll();

        //then
        AdmissionApp admissionApp = admissionAppsList.get(0);
        Assertions.assertThat(admissionApp.getIdNumber()).isEqualTo(idNumber);
        Assertions.assertThat(admissionApp.getPhoneNumber()).isEqualTo(phoneNumber);
        Assertions.assertThat(admissionApp.getEmail()).isEqualTo(email);
        Assertions.assertThat(admissionApp.getAddress()).isEqualTo(address);
        Assertions.assertThat(admissionApp.getAddress2()).isEqualTo(address2);
        Assertions.assertThat(admissionApp.getZip()).isEqualTo(zip);
        Assertions.assertThat(admissionApp.getGender()).isEqualTo(gender);
        Assertions.assertThat(admissionApp.getSelfIntroduce()).isEqualTo(selfIntroduce);
        System.out.println("createAt = " + admissionApp.getCreateAt());
        System.out.println("updatedAt = " + admissionApp.getUpdatedAt());

    }
}