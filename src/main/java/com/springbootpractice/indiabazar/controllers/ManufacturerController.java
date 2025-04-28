package com.springbootpractice.indiabazar.controllers;

import com.springbootpractice.indiabazar.entities.Manufacturer;
import com.springbootpractice.indiabazar.services.ManufacturerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manufacturer")
public class ManufacturerController {
    @Autowired
    private ManufacturerService manufacturerService;
    @GetMapping
    public Manufacturer getManufacturerById(@RequestParam(value = "id") int id){
        return manufacturerService.getManufacturerById(id);
    }
}
