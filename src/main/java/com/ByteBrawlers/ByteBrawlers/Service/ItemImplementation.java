package com.ByteBrawlers.ByteBrawlers.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.ByteBrawlers.ByteBrawlers.Model.Item;
import com.ByteBrawlers.ByteBrawlers.Model.Image;
import com.ByteBrawlers.ByteBrawlers.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Exceptions.ItemNotFoundException;

@Service
public class ItemImplementation implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public ItemImplementation(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item getItem(Integer id) {
        return itemRepository.findById(id).get();
    }

    @Override
    public void createItem(Item item) {
        itemRepository.save(item);
    }

    @Override
    public void updateItem(Item item) {
        itemRepository.save(item);
    }

    @Override
    public void deleteItem(Integer id) {
        itemRepository.deleteById(id);
    }
}
