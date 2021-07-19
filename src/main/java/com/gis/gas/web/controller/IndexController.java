package com.gis.gas.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
}
