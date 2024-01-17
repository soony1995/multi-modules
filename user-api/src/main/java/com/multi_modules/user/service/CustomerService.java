package com.multi_modules.user.service;

import com.multi_modules.user.domain.entity.Customer;
import com.multi_modules.user.domain.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public Optional<Customer> findByIdAndEmail(long id,String email){
        return customerRepository.findById(id)
                .stream().filter(customer -> customer.getEmail().equals(email))
                .findFirst();
    }
    public Optional<Customer> finalValidCustomer(String email, String password) {
        return customerRepository.findByEmail(email).stream().filter(
                // 이런게 함수형의 장점
                customer -> customer.getPassword().equals(password) && customer.isVerify())
                .findFirst();
    }
}
