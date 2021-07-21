package com.gis.gas.service.admissionapp;

import com.gis.gas.domain.admissionapp.AdmissionApp;
import com.gis.gas.domain.admissionapp.AdmissionAppRepository;
import com.gis.gas.web.dto.admissionapp.AdmissionAppListResponseDto;
import com.gis.gas.web.dto.admissionapp.AdmissionAppResponseDto;
import com.gis.gas.web.dto.admissionapp.AdmissionAppSaveRequestDto;
import com.gis.gas.web.dto.admissionapp.AdmissionAppUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class AdmissionAppService {

    private final AdmissionAppRepository admissionAppRepository;

    @Transactional
    public Long save(AdmissionAppSaveRequestDto requestDto) {
        return admissionAppRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, AdmissionAppUpdateRequestDto requestDto) {
        AdmissionApp admissionApp = admissionAppRepository.findById(id).orElseThrow(()
                -> new IllegalArgumentException("해당 게시글이 없습니다."));

        admissionApp.update(requestDto.getName(), requestDto.getIdNumber(), requestDto.getPhoneNumber(), requestDto.getEmail(), requestDto.getAddress(), requestDto.getAddress2(), requestDto.getZip(), requestDto.getGender(), requestDto.getSelfIntroduce());

        return id;
    }
    @Transactional
    public AdmissionAppResponseDto findById(Long id) {
        AdmissionApp entity = admissionAppRepository.findById(id).orElseThrow(()
                -> new IllegalArgumentException("해당 게시글이 없습니다. id = " + id));

        return new AdmissionAppResponseDto(entity);
    }
    @Transactional
    public List<AdmissionAppListResponseDto> findAllDesc() {
        return admissionAppRepository.findAllDesc().stream().
                map(AdmissionAppListResponseDto::new).collect(Collectors.toList());
    }
    @Transactional
    public void delete(Long id) {
        AdmissionApp admissionApp = admissionAppRepository.findById(id).orElseThrow(()
                -> new IllegalArgumentException("해당 게시글이 없습니다."));

        admissionAppRepository.delete(admissionApp);
    }
}
