package com.dutta.lazyEx.repo;

import com.dutta.lazyEx.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ItemRepository extends JpaRepository<Item,Integer> {
}
