package com.mustache.bbs2.exceptions;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    DUPLICATED_USER_NAME(HttpStatus.CONFLICT, "User name is duplicated"),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "Internal server error"),
    USER_NOT_FOUNDED(HttpStatus.NOT_FOUND, ""),
    NOT_FOUNDED(HttpStatus.NOT_FOUND, ""),
    INVALID_PASSWORD(HttpStatus.BAD_REQUEST, "");

    private HttpStatus status;
    private String message;
}
