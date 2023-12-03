package com.ByteBrawlers.ByteBrawlers.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.ByteBrawlers.ByteBrawlers.Model.Reviews;

@RestController
@CrossOrigin
public class ReviewController {

    @Autowired
    private Reviews review;

    public ReviewController(Reviews review) {
        this.review = review;
    }
}
