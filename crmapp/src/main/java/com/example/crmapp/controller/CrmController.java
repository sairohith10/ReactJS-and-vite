package com.example.crmapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crmapp.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/api/crm/customers")
@CrossOrigin(origins = "http://localhost:5173") 
public class CrmController {
    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<?> getCustomers() {
        return customerService.getCustomersFromCustomerApp();
    }
}
