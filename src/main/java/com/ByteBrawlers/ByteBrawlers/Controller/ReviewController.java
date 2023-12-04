package com.ByteBrawlers.ByteBrawlers.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ByteBrawlers.ByteBrawlers.Model.Reviews;
import com.ByteBrawlers.ByteBrawlers.Service.ReviewService;

import jakarta.annotation.PostConstruct;

@RestController
@CrossOrigin
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
    }

    @PostConstruct
    private void init() {

    }

    @GetMapping
    public List<String> getReviews() {
        return ReviewService.getAllReviews();
    }
}
