package com.gis.gas.web.controller;

import com.gis.gas.service.admissionapp.AdmissionAppService;
import com.gis.gas.web.dto.admissionapp.AdmissionAppResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class ApplicationSystemController {
    @GetMapping("/admissionapp")
    public String admissionIndex() {
        return "/application-system/application-index";
    }
    @GetMapping("/admissionapp/save")
    public String admissionSave() {
        return "/application-system/save";
    }

    private final AdmissionAppService admissionAppService;
    @GetMapping("/admissionapp/list-view")
    public String admissionListView(Model model) {
        model.addAttribute("admissionapp", admissionAppService.findAllDesc());
        return "/application-system/list-view";
    }
    @GetMapping("/admissionapp/application-view/{id}")
    public String admissionView(@PathVariable Long id, Model model) {
        AdmissionAppResponseDto dto = admissionAppService.findById(id);
        model.addAttribute("admissionapp", dto);
        return "/application-system/application-view";
    }
    @GetMapping("/admissionapp/application-modify/{id}")
    public String admissionModify(@PathVariable Long id, Model model) {
        AdmissionAppResponseDto dto = admissionAppService.findById(id);
        model.addAttribute("admissionapp", dto);
        return "/application-system/application-modify";
    }
}