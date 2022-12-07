package com.mustache.bbs2.controller;

import com.mustache.bbs2.domain.dto.VisitCreateRequest;
import com.mustache.bbs2.service.VisitService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/visits")
@RequiredArgsConstructor
public class VisitsController {

    private final VisitService visitService;

    @PostMapping
    public ResponseEntity<String> createVisitLog(@RequestBody VisitCreateRequest visitCreateRequest, Authentication authentication) {
        String userName = authentication.getName();
        log.info("userName:{}", userName);
        visitService.createVisit(visitCreateRequest, userName);
        return ResponseEntity.ok().body("방문 기록이 등록 되었습니다.");
    }
}
