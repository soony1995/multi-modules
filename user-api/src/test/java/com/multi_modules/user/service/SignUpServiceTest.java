package com.multi_modules.user.service;

import com.multi_modules.user.domain.SignUpForm;
import com.multi_modules.user.domain.entity.Customer;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.LocalDate;


@SpringBootTest
class SignUpServiceTest {

    @Autowired
    private SignUpService service;

    @Test
    void signUp(){
        SignUpForm form = SignUpForm.builder()
                .name("name")
                .birth(LocalDate.now())
                .email("abc@gmail.com")
                .password("1")
                .phone("1241")
                .build();
        Customer c = service.signUp(form);
        Assertions.assertThat(service.signUp(form).getId()).isNotNull();
    }
}