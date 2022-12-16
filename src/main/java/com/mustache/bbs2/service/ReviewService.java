package com.mustache.bbs2.service;

import com.mustache.bbs2.domain.dto.ReviewCreateRequest;
import com.mustache.bbs2.domain.entity.Hospital;
import com.mustache.bbs2.domain.entity.Review;
import com.mustache.bbs2.repository.HospitalRepository;
import com.mustache.bbs2.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final HospitalRepository hospitalRepository;

    public Review get(Long id){
        Optional<Review> reviews = reviewRepository.findById(id);
        return reviews.get();
    }

    public Page<Review> getReviews(Integer hospitalId, Pageable pageable) {
        Page<Review> reviews = reviewRepository.findByHospitalId(hospitalId, pageable);
        return reviews;
    }

    public void create(ReviewCreateRequest dto) {
        // hospitalId를 받아서 Hospital을 select함
        Optional<Hospital> optionalHospital = hospitalRepository.findById(dto.getHospitalId());
        Review savedReview = reviewRepository.save(Review.of(
                optionalHospital.orElseThrow(()-> new IllegalArgumentException("해당 hospitalId에 해당하는 병원이 없습니다.")),
                dto.getTitle(), dto.getContent(), dto.getUserName()));
    }
}