package com.ByteBrawlers.ByteBrawlers.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ByteBrawlers.ByteBrawlers.Model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
}
