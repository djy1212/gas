package com.gis.gas.web.controller;

import com.gis.gas.service.admissionapp.AdmissionAppService;
import com.gis.gas.web.dto.admissionapp.AdmissionAppResponseDto;
import com.gis.gas.web.dto.admissionapp.AdmissionAppSaveRequestDto;
import com.gis.gas.web.dto.admissionapp.AdmissionAppUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class AdmissionAppApiController {

    private final AdmissionAppService admissionAppService;

    @PostMapping("/api/v1/admissionapp")
    public Long save(@RequestBody AdmissionAppSaveRequestDto requestDto) {
        System.out.println("requestDto.getName() = " + requestDto.getName());
        System.out.println("requestDto.getName() = " + requestDto.getAddress());
        return admissionAppService.save(requestDto);
    }

    @PutMapping("/api/v1/admissionapp/{id}")
    public Long update(@PathVariable Long id, @RequestBody AdmissionAppUpdateRequestDto requestDto) {
        return admissionAppService.update(id, requestDto);
    }

    @GetMapping("/api/v1/admissionapp/{id}")
    public AdmissionAppResponseDto findById(@PathVariable Long id) {
        return admissionAppService.findById(id);
    }
}