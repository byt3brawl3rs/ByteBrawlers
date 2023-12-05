package com.ByteBrawlers.ByteBrawlers.Service;

import java.util.List;

import com.ByteBrawlers.ByteBrawlers.Model.Item;

public interface ItemService {

    public List<Item> getAllItems();

    public Item getItem(Integer id);

    public void createItem(Item item);

    public void updateItem(Item item);

    public void deleteItem(Integer id);

    public List<Item> getItemsByColorId(Integer colorId);

    public List<Item> getItemsByFormFactorId(Integer formFactorId);

    public List<Item> gotItemsBySizeID(Integer sizeId);

    public List<Item> getAllEvenIdItems();

    public List<Item> getAllItemsWherePriceLower20();

    public List<Item> getFiveRandomItems();

    public List<Item> getAllBySearchParameter(String searchParam);
}
