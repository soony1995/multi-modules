package com.multi_modules.user.client;

import com.multi_modules.user.client.mailgun.SendMailForm;
import feign.Response;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

// TODO: 인터페이스로 작성한 뒤에 가져다가 쓰면 된다.
// SpringQueryMap은 쿼리를 string으로 보내게 해주는 메서드이다.
// 이는 mailgun 쪽에서 그렇게 보내라고 명시되어 있기 때문에 이렇게 보냄.
@FeignClient(name = "mailgun" , url = "https://api.mailgun.net/v3/")
@Qualifier("mailgun")
public interface MailgunClient {
    @PostMapping("sandboxb7f4396e3cd846e487b3cd8c05cbe768.mailgun.org/messages")
    ResponseEntity<Response> sendEmail(@SpringQueryMap SendMailForm form);
}
