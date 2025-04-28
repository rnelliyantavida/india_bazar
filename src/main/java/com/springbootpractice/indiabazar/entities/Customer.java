package com.springbootpractice.indiabazar.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    private Integer id;
    private String last;
    private String first;
    private String mobile;
    private String homephone;
    private String officeEmail;
    private String personalEmail;
    private char status;
}
