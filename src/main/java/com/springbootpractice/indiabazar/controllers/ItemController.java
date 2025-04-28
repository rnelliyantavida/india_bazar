package com.springbootpractice.indiabazar.controllers;

import com.springbootpractice.indiabazar.entities.Item;
import com.springbootpractice.indiabazar.services.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;
    @GetMapping("/{id}")
    public Item getItemById(@PathVariable("id") int id){
        return itemService.getItemById(id);
    }
}
