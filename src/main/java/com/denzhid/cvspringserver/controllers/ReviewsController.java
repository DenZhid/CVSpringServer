package com.denzhid.cvspringserver.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewsController {

    @RequestMapping("/reviews")
    public String getReviews() {
        return "reviews_page.html";
    }
}
