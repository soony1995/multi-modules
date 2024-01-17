package com.multi_modules.user.service;

import com.multi_modules.user.domain.SignUpForm;
import com.multi_modules.user.domain.entity.Customer;
import com.multi_modules.user.domain.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignUpService {
    private final CustomerRepository customerRepository;
    public Customer signUp(SignUpForm form){
        return customerRepository.save(Customer.from(form));
    }
}
