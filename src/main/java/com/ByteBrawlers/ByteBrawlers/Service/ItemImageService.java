package com.ByteBrawlers.ByteBrawlers.Service;

import com.ByteBrawlers.ByteBrawlers.Model.ItemImage;

import java.util.List;

public interface ItemImageService {
    public String createItemImage(ItemImage itemImage);

    public String updateItemImage(ItemImage itemImage);

    public String deleteItemImage(int imageId);

    public ItemImage getItemImage(int imageId);

    public List<ItemImage> getAllItemImages();
}
