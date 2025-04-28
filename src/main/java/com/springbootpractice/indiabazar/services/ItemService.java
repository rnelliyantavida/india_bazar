package com.springbootpractice.indiabazar.services;

import com.springbootpractice.indiabazar.entities.Item;
import com.springbootpractice.indiabazar.repositories.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public Item getItemById(int id) {
        List<Item> items = itemRepository.findAll();
        Item item = null;
        for (Item item1:items)
            if(item1.getId() == id)
                item = item1;
        return item;
    }
}
