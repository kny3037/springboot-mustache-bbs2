package com.mustache.bbs2.service;

import com.mustache.bbs2.domain.dto.VisitCreateRequest;
import com.mustache.bbs2.domain.dto.VisitResponse;
import com.mustache.bbs2.domain.entity.Hospital;
import com.mustache.bbs2.domain.entity.User;
import com.mustache.bbs2.domain.entity.Visit;
import com.mustache.bbs2.exceptions.ErrorCode;
import com.mustache.bbs2.exceptions.HospitalReviewAppException;
import com.mustache.bbs2.repository.HospitalRepository;
import com.mustache.bbs2.repository.UserRepository;
import com.mustache.bbs2.repository.VisitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VisitService {

  /*  private final VisitRepository visitRepository;
    private final HospitalRepository hospitalRepository;
    private final UserRepository userRepository;

    public void createVisit(VisitCreateRequest dto, String userName) {

        // hospital이 없을 때 등록불가
        Hospital hospital = hospitalRepository.findById(dto.getHospitalId())
                .orElseThrow(() -> new HospitalReviewAppException(ErrorCode.NOT_FOUNDED, String.format("hospitalId:%s 가 없습니다.", dto.getHospitalId())));

        // user가 없을 때 등록불가
        User user = userRepository.findByUserName(userName)
                .orElseThrow(() -> new HospitalReviewAppException(ErrorCode.USER_NOT_FOUNDED, String.format("%s user가 없습니다.", userName)));

        Visit visit = Visit.builder()
                .user(user)
                .hospital(hospital)
                .disease(dto.getDisease())
                .amount(dto.getAmount())
                .build();
        visitRepository.save(visit);
    }
    public List<VisitResponse> findAllByPage(Pageable pageable) {
        Page<Visit> visits = visitRepository.findAll(pageable);

        // Visits --> VisitResponse
        return visits.stream()
                .map(Visit::toResponse)
                .collect(Collectors.toList());
    }

    public List<VisitResponse> listByUser(Long id) {
        User savedUser = userRepository.findById(id).orElseThrow(()->new HospitalReviewException(ErrorCode.NOT_FOUND, "해당 유저가 없습니다."));
        List<Visit> visitsList = visitRepository.findByUser(savedUser);
        List<VisitResponse> visitResponseList = visitsList.stream()
                .map(visits -> VisitResponse.builder(visit))
                .collect(Collectors.toList());
        return visitResponseList;
    }

    public List<VisitResponse> listByHospital(Long id) {
        Hospital savedHospital = hospitalRepository.findById(id).orElseThrow(()->new HospitalReviewException(ErrorCode.NOT_FOUND, "해당 병원이 없습니다."));
        List<Visit> visitsList = visitRepository.findByHospital(savedHospital);
        List<VisitResponse> visitResponseList = visitsList.stream()
                .map(visits -> VisitResponse.of(visits))
                .collect(Collectors.toList());
        return visitResponseList;
    }*/
}