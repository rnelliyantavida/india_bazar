package com.springbootpractice.indiabazar.services;

import com.springbootpractice.indiabazar.entities.Manufacturer;
import com.springbootpractice.indiabazar.repositories.ManufacturerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerService {
    @Autowired
    private ManufacturerRepository manufacturerRepository;

    public Manufacturer getManufacturerById(int id) {
        List<Manufacturer> manufacturers = manufacturerRepository.findAll();
        Manufacturer manufacturer = null;
        for (Manufacturer manufacturer1:manufacturers)
            if(manufacturer1.getId() == id)
                manufacturer = manufacturer1;
        return manufacturer;
    }
}
