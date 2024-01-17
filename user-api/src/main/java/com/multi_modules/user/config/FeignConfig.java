package com.multi_modules.user.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;

/* TODO: [401 Unauthorized] during [POST] to [https://api.mailgun.net/v3/sandboxb7f4396e3cd846e487b3cd8c05cbe768.mailgun.org/messages?subject=hihi&from=sanbonpeople%40daum.net&text=heelo&to=dhtnscjf12%40gmail.com] [MailgunClient#sendEmail(SendMailForm)]: [Forbidden] 에러가 발생함.
   이 파일을 지우고 테스트를 해봐도 똑같은 에러가 발생함.
   -> 현재 사용하지 못하고 있다고 판단됨.

 */

@Configuration
public class FeignConfig {
    @Qualifier(value = "mailgun")
    @Bean
    public BasicAuthenticationInterceptor basicAuthenticationInterceptor(){
        return new BasicAuthenticationInterceptor("api","77544f4ccea6d269f52b2430f72a0427-4c955d28-a0280df1");
    }
}