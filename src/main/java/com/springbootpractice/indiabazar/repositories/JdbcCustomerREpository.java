//package com.springbootpractice.indiabazar.repositories;
//
//import com.springbootpractice.indiabazar.entities.Customer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class JdbcCustomerREpository implements CustomerRepository {
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    String sql = "SELECT * FROM customer WHERE id=?";
//
//    @Override
//    public List<Customer> findCustomerByIdd(int id) {
//        return jdbcTemplate.queryForObject(sql,new Object[]{id},((rs, rowNum) -> new Customer(
//                rs.getInt("id"),
//                rs.getString("last"),
//
//        )));
//    }
//}
