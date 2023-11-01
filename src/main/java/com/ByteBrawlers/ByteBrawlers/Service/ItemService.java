package com.ByteBrawlers.ByteBrawlers.Service;

import java.util.List;

import com.ByteBrawlers.ByteBrawlers.Model.Item;
import com.ByteBrawlers.ByteBrawlers.DTO.ItemDTO;
import com.ByteBrawlers.ByteBrawlers.Model.ItemImage;

public interface ItemService {
    public String createItem(Item item);

    public String addItemImage(Integer itemId, ItemImage image);

    public String removeItemImage(Integer itemId, Integer imageId);

    public List<ItemImage> getAllItemImages(Integer itemId);

    public String updateItem(Item item);

    public String deleteItem(Integer itemId);

    public Item getItem(Integer itemId);

    public List<Item> getAllItems();
}
