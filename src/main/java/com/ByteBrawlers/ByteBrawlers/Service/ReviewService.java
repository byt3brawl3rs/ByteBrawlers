package com.ByteBrawlers.ByteBrawlers.Service;

import java.util.List;

import com.ByteBrawlers.ByteBrawlers.Model.Reviews;

public interface ReviewService {
    public void createReview(Reviews review);

    public static List<String> getAllReviews() {
        return null ;
    }
}
