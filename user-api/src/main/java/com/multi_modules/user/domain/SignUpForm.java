package com.multi_modules.user.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
// 실제로 테스트 할 때에는 builder를 사용하는 것 보다 mocking을 이용해 값을 주입해주는 것이 좋지만,
// 편의상 빌더를 이용해 테스트를 진행함.
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SignUpForm {
    private String email;
    private String name;
    private String password;
    private LocalDate birth;
    private String phone;
}
