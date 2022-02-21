package com.denzhid.cvspringserver.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CvController {

    @RequestMapping("/cv")
    public String getCv() {
        return "cv_page.html";
    }
}
