package com.multi_modules.user.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
@Getter
public enum ErrorCode {
    NOT_FOUND_ACCOUNT(HttpStatus.BAD_REQUEST,"이미 가입된 회원입니다."),

    //login
    LOGIN_CHECK_FAIL(HttpStatus.BAD_REQUEST,"아이디나 패스워드를 확인해주세요.");

    private final  HttpStatus httpStatus;
    private final String detail;
}
