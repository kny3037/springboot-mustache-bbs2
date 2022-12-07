package com.mustache.bbs2.domain.dto;

import com.mustache.bbs2.domain.entity.Hospital;
import com.mustache.bbs2.domain.entity.User;
import com.mustache.bbs2.domain.entity.Visit;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class VisitCreateRequest {
    private Integer hospitalId;
    private String disease;
    private float amount;
}
