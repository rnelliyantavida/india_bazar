package com.springbootpractice.indiabazar.repositories;

import com.springbootpractice.indiabazar.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CustomerRepository extends JpaRepository<Customer,Integer>{
//    List<Customer> findCustomerByIdd(int id);
}
