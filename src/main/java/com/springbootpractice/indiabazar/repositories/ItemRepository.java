package com.springbootpractice.indiabazar.repositories;

import com.springbootpractice.indiabazar.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer> {
}
