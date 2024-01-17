package com.multi_modules.user.appication;

import com.multi_modules.common.config.JwtAuthenticationProvider;
import com.multi_modules.common.domain.common.UserType;
import com.multi_modules.user.domain.SignInForm;
import com.multi_modules.user.domain.entity.Customer;
import com.multi_modules.user.exception.CustomException;
import com.multi_modules.user.exception.ErrorCode;
import com.multi_modules.user.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// 따로 application으로 빼는 이유는 서로 signInService랑 다른 일을 하기 때문에 분리한다.
@Service
@RequiredArgsConstructor
public class SignInApplication {
    private final CustomerService customerService;
    // TODO: Could not autowire. No beans of 'JwtAuthenticationProvider' type found.
    // 해결: JwtAuthenticationProvider 어노테이션 service 추가.
    private final JwtAuthenticationProvider provider;

    public String customerLoginToken(SignInForm form){
        // 1. 로그인 가능여부
        Customer c = customerService.finalValidCustomer(form.getEmail(),form.getPassword())
                .orElseThrow(()-> new CustomException(ErrorCode.LOGIN_CHECK_FAIL));
        // 2. 토큰 발행

        // 토큰은 주문에서도 사용하기 때문에 새로운 모듈을 만들어준다.

        // 3. 토큰을 response 한다.
        return provider.createToken(c.getEmail(),c.getId(), UserType.CUSTOMER);
    }
}
