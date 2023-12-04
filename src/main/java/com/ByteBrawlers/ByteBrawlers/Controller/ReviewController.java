package com.ByteBrawlers.ByteBrawlers.Controller;

import com.ByteBrawlers.ByteBrawlers.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.ByteBrawlers.ByteBrawlers.Model.Reviews;

@RestController
@CrossOrigin
public class ReviewController {

    @Autowired
    private ReviewService review;

    public ReviewController(ReviewService review) {
        this.review = review;
    }
}
