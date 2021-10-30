package com.gis.gams.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class GamsIndexController {
    @GetMapping("/")
    public String Index() {
        return "index";
    }
    @GetMapping("/gams")
    public String gamsIndex() {
        return "/gams/gams-index";
    }
    @GetMapping("/gams/student-management/student-list")
    public String studentList() {
        return "/gams/student-management/student-list";
    }
    @GetMapping("/gams/student-management/student-detail")
    public String studentDetail() {
        return "/gams/student-management/student-detail";
    }
}