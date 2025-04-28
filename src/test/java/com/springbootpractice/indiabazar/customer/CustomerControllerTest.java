package com.springbootpractice.indiabazar.customer;

import com.springbootpractice.indiabazar.controllers.CustomerController;
import com.springbootpractice.indiabazar.entities.Customer;
import com.springbootpractice.indiabazar.services.CustomerService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = {CustomerControllerTest.class})
public class CustomerControllerTest {
    @Mock
    CustomerService customerService;
    @InjectMocks
    CustomerController customerController;
    @Test
    public void getCustomerById(){
        Customer customer = new Customer(2,"Lokam","Madhavi","1-248-209-1236","1-248-233-1011",null,null,'A');
        int customerId = 2;
        when(customerService.getCustomerById(customerId)).thenReturn(customer);
        assertEquals(customerId,customerController.getCustomerById(customerId).getId());
    }
}
