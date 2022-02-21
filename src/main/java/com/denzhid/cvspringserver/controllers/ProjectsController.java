package com.denzhid.cvspringserver.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectsController {

    @RequestMapping("/projects")
    public String getProjects() {
        return "projects_page.html";
    }
}
