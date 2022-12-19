package com.mustache.bbs2.controller;

import com.mustache.bbs2.domain.dto.VisitCreateRequest;
import com.mustache.bbs2.domain.dto.VisitResponse;
import com.mustache.bbs2.domain.response.Response;
import com.mustache.bbs2.service.VisitService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/v1/visits")
@RequiredArgsConstructor
public class VisitsController {

 /*   private final VisitService visitService;

    @PostMapping
    public Response<VisitResponse> write(@RequestBody VisitCreateRequest visitCreateRequest, Authentication authentication){
        VisitResponse visits = visitService.createVisit(visitCreateRequest, authentication.getName());
        return Response.success(visits);
    }
    @GetMapping
    public Response<List<VisitResponse>> list(){
        List<VisitResponse> visitResponseList = visitService.list();
        return Response.success(visitResponseList);
    }
    @GetMapping("/users/{id}")
    public Response<List<VisitResponse>> listByUser(@PathVariable Long id){
        List<VisitResponse> visitResponseList = visitService.listByUser(id);
        return Response.success(visitResponseList);
    }

    @GetMapping("/hospitals/{id}")
    public Response<List<VisitResponse>> listByHospital(@PathVariable Long id){
        List<VisitResponse> visitResponseList = visitService.listByHospital(id);
        return Response.success(visitResponseList);
    }*/
}