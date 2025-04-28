package com.springbootpractice.indiabazar.customer;

import com.springbootpractice.indiabazar.entities.Customer;
import com.springbootpractice.indiabazar.repositories.CustomerRepository;
import com.springbootpractice.indiabazar.services.CustomerService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = {CustomerServiceTest.class})
public class CustomerServiceTest {
    @Mock
    CustomerRepository customerRepository;
    @InjectMocks
    CustomerService customerService;
    @Test
    public void getCustomerById(){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(2,"Lokam","Madhavi","1-248-209-1236","1-248-233-1011",null,null,'A'));
        customers.add(new Customer(3,"Ruksana","Ash","1-248-209-1236","1-248-233-1011",null,null,'A'));
        when(customerRepository.findAll()).thenReturn(customers);
        int customerId = 2;
        assertEquals(customerId,customerService.getCustomerById(customerId).getId());
    }
}
