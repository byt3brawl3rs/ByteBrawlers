package com.ByteBrawlers.ByteBrawlers.Service;

import com.ByteBrawlers.ByteBrawlers.DTO.ItemImageDTO;
import com.ByteBrawlers.ByteBrawlers.Model.ItemImage;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ItemImageService {
    public String createItemImage(ItemImage itemImage);

    public String updateItemImage(ItemImage itemImage);

    public String deleteItemImage(Integer imageId);

    public ItemImageDTO getItemImage(Integer imageId);

    public List<ItemImage> getAllItemImages();
}
