package com.multi_modules.user.client.mailgun;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.w3c.dom.Text;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class SendMailForm {
    private String from;
    private String to;
    private String subject;
    private String text;
}
