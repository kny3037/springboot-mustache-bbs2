package com.mustache.bbs2.controller;

import com.mustache.bbs2.domain.entity.Hospital;
import com.mustache.bbs2.repository.HospitalRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hospital")
@Slf4j
public class HospitalController {

    private final HospitalRepository hospitalRepository;

    public HospitalController(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    /*@GetMapping("/list")
    public String list(Model model,Pageable pageable){
        Page<Hospital> hospitals = hospitalRepository.findAll(pageable);
        log.info("size:{}", hospitals.getSize());
        model.addAttribute("hospitals", hospitals);
        model.addAttribute("previous", pageable.previousOrFirst().getPageNumber());
        model.addAttribute("next", pageable.next().getPageNumber());
        return "hospital/list";
    }*/

    @GetMapping("")
    public String list(@RequestParam(value = "keyword", required = false) String keyword , Pageable pageable, Model model) {
                        // (@RequestParam String keyword, Pageable pageable,~
                        // 이게 강사님 코드. 내가 이렇게 실행하니 Required String parameter '인자' is not present 에러가 났다.
                        // required속성을 false값으로 줘서 해당 Parameter를 반드시 받지 않아도 되게 해줬다.
        // keyword는 어떻게 받을 것인가?
        log.info("keyword : {} ", keyword);
        Page<Hospital> hospitals = hospitalRepository.findByRoadNameAddressContaining(keyword, pageable);
        model.addAttribute("hospitals", hospitals);
        model.addAttribute("previous", pageable.previousOrFirst().getPageNumber());
        model.addAttribute("next", pageable.next().getPageNumber());
        return "hospital/list";
    }

}
