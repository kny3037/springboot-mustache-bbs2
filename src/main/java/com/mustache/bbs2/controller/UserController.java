package com.mustache.bbs2.controller;

import com.mustache.bbs2.domain.dto.UserDto;
import com.mustache.bbs2.domain.dto.UserJoinRequest;
import com.mustache.bbs2.domain.dto.UserJoinResponse;
import com.mustache.bbs2.domain.dto.UserLoginRequest;
import com.mustache.bbs2.domain.response.Response;
import com.mustache.bbs2.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/join")
    public Response<UserJoinResponse> join(@RequestBody UserJoinRequest request) {
        log.info("{}", request);
        UserDto userDto = userService.join(request.getUserName(), request.getPassword());
        UserJoinResponse response = UserJoinResponse.fromUser(userDto);
        return Response.success(response);
    }
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserLoginRequest dto) {
        return ResponseEntity.ok().body(userService.login(dto.getUserName(), ""));
    }
}