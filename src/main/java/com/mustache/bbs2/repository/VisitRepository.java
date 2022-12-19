package com.mustache.bbs2.repository;

import com.mustache.bbs2.domain.entity.Hospital;
import com.mustache.bbs2.domain.entity.User;
import com.mustache.bbs2.domain.entity.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VisitRepository extends JpaRepository<Visit, Long> {
    List<Visit> findByUser(User user);
    List<Visit> findByHospital(Hospital hospital);
}
