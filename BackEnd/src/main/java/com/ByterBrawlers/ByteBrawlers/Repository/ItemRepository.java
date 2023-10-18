package com.ByterBrawlers.ByteBrawlers.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ByterBrawlers.ByteBrawlers.Model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
