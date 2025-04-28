package com.springbootpractice.indiabazar.services;

import com.springbootpractice.indiabazar.entities.Customer;
import com.springbootpractice.indiabazar.repositories.CustomerRepository;
//import com.springbootpractice.indiabazar.repositories.JdbcCustomerREpository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    //private JdbcCustomerREpository jdbcCustomerREpository;

    public Customer getCustomerById(int id) {
        Customer customer = customerRepository.findById(id).get();
//        List<Customer> customers = customerRepositor.findAll();
//        Customer customerNow = null;
//        for (Customer customer:customers)
//            if(customer.getId() == id)
//                customerNow = customer;
        return customer;
    }
}
