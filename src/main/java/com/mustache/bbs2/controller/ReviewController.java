package com.mustache.bbs2.controller;

import com.mustache.bbs2.domain.dto.ReviewCreateRequest;
import com.mustache.bbs2.domain.entity.Review;
import com.mustache.bbs2.service.ReviewService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Review> get(@PathVariable Long id) {
        return ResponseEntity.ok().body(reviewService.get(id));
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody ReviewCreateRequest dto) {
        reviewService.create(dto);
        return ResponseEntity.ok().body(null);
    }
}