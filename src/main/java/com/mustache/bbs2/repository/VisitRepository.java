package com.mustache.bbs2.repository;

import com.mustache.bbs2.domain.entity.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitRepository extends JpaRepository<Visit, Long> {
}
