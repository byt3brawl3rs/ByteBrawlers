package com.ByteBrawlers.ByteBrawlers.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ByteBrawlers.ByteBrawlers.Model.Item;
import com.ByteBrawlers.ByteBrawlers.Repository.ItemRepository;

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

    @Override
    public List<Item> getItemsByColorId(Integer colorId) {
        return itemRepository.findAllByColorId(colorId);
    }

    @Override
    public List<Item> gotItemsBySizeID(Integer sizeId) {
        return itemRepository.findAllBySizeId(sizeId);
    }

    @Override
    public List<Item> getAllEvenIdItems() {
        return itemRepository.findAllByEvenItemId();
    }

    @Override
    public List<Item> getItemsByFormFactorId(Integer formFactorId) {
        return itemRepository.findAllByFormFactorId(formFactorId);
    }

    @Override
    public List<Item> getAllItemsWherePriceLower20() {
        return itemRepository.findAllByPriceLower20();
    }


    public List<Item> getFiveRandomItems() {
        return itemRepository.findFiveRandomItems();
    }

    @Override
    public List<Item> getAllBySearchParameter(String searchParam) {
        return itemRepository.findAllBySearchParameter(searchParam);
    }
}
