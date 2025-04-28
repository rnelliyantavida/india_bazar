package com.springbootpractice.indiabazar.controllers;

import com.springbootpractice.indiabazar.entities.Customer;
import com.springbootpractice.indiabazar.entities.Item;
import com.springbootpractice.indiabazar.services.CustomerService;
import com.springbootpractice.indiabazar.services.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable("id") int id){
        return customerService.getCustomerById(id);
    }
}
