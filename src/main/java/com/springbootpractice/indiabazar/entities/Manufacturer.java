package com.springbootpractice.indiabazar.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Manufacturer {
    @Id
    private int id;
    private String name;
    private String web_addr;
    private String mainPh;
    private String city;
    private String state;
    private String zip;
    private String tin;
    private LocalDate date_created;
}
