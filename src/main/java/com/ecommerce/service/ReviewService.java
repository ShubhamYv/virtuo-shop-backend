package com.ecommerce.service;

import java.util.List;

import com.ecommerce.exception.ProductException;
import com.ecommerce.modal.Review;
import com.ecommerce.modal.User;
import com.ecommerce.request.ReviewRequest;

public interface ReviewService {

	Review createReview(ReviewRequest req,User user) throws ProductException;
	
	List<Review> getAllReview(Long productId);
	
	
}
