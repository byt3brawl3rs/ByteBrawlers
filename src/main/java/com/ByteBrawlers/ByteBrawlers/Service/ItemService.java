package com.ByteBrawlers.ByteBrawlers.Service;

import java.util.List;

import com.ByteBrawlers.ByteBrawlers.Model.Item;
import com.ByteBrawlers.ByteBrawlers.Response.ItemResponse;

public interface ItemService {
    public String createItem(Item item);

    public String updateItem(Item item);

    public String deleteItem(int itemId);

    public ItemResponse getItem(int itemId);

    public List<Item> getAllItems();
}
