package com.mustache.bbs2.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public class ReviewCreateRequest {
    private Integer hospitalId;
    private String userName;
    private String title;
    private String content;
}
