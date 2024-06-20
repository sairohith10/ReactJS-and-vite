package com.example.crmapp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CustomerService {
    private final RestTemplate restTemplate = new RestTemplate();
    private final String CUSTOMER_APP_URL = "http://localhost:5172/api/customer";

    public List<?> getCustomersFromCustomerApp() {
        return restTemplate.getForObject(CUSTOMER_APP_URL, List.class);
    }
}
