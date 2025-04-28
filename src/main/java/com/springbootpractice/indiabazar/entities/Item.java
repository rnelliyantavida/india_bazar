package com.springbootpractice.indiabazar.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Item {
    @Id
    private int id;
    private String name;
    private String description;
    private String sku_no;
    private float weight;
    private String weightUnits;
    private float height;
    private float width;
    private float length;
    private String dimUnits;
    private float listPrice;
    private float maxDiscount;
    private char status;
}
