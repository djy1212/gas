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
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/admissionapp/save")
    public String admissionSave() {
        return "save";
    }

    private final AdmissionAppService admissionAppService;
    @GetMapping("/admissionapp/list-view")
    public String admissionListView(Model model) {
        model.addAttribute("admissionapp", admissionAppService.findAllDesc());
        return "list-view";
    }
    @GetMapping("/admissionapp/application-view/{id}")
    public String admissionView(@PathVariable Long id, Model model) {
        AdmissionAppResponseDto dto = admissionAppService.findById(id);
        model.addAttribute("admissionapp", dto);
        return "application-view";
    }
    @GetMapping("/admissionapp/application-modify/{id}")
    public String admissionModify(@PathVariable Long id, Model model) {
        AdmissionAppResponseDto dto = admissionAppService.findById(id);
        model.addAttribute("admissionapp", dto);
        return "application-modify";
    }
}