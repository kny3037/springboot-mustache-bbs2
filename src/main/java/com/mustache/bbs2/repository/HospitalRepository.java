package com.mustache.bbs2.repository;

import com.mustache.bbs2.domain.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
    List<Hospital> findByBusinessTypeNameIn(List<String> businessTypes);

   List<Hospital> findByRoadNameAddressContaining(String keyword); // 포함

    List<Hospital> findByHospitalNameStartsWith(String keyword); // 시작

    List<Hospital> findByHospitalNameEndsWith(String keyword); // 끝남


}
