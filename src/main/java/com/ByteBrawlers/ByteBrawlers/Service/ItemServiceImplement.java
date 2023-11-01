package com.ByteBrawlers.ByteBrawlers.Service;

import java.util.List;
import java.util.Optional;

import com.ByteBrawlers.ByteBrawlers.Model.Item;
import com.ByteBrawlers.ByteBrawlers.Model.ItemImage;
import com.ByteBrawlers.ByteBrawlers.Repository.ItemImageRepository;
import com.ByteBrawlers.ByteBrawlers.Repository.ItemRepository;
import com.ByteBrawlers.ByteBrawlers.DTO.ItemDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import Exceptions.ItemNotFoundException;

@Service
public class ItemServiceImplement implements ItemService {

    private final RestTemplate restTemplate;
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private ItemImageRepository itemImageRepository;
    @Autowired
    private ModelMapper mapper;

    public ItemServiceImplement(@Value("http://localhost:8080/items") String itemBaseURL, RestTemplateBuilder builder,
                                ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
        this.restTemplate = builder.rootUri(itemBaseURL).build();
    }

    @Override
    public String createItem(Item item) {
        itemRepository.save(item);
        return "Saving item...";
    }

    @Override
    public String addItemImage(Integer itemId, ItemImage image) {
        getItem(itemId).addImage(image);
        itemImageRepository.save(image);
        return "Adding image to item";
    }

    @Override
    public String removeItemImage(Integer itemId, Integer imageId) {
        getItem(itemId).removeImage(itemImageRepository.getReferenceById(imageId));
        itemImageRepository.deleteById(imageId);
        return "Removing image from item";
    }

    @Override
    public List<ItemImage> getAllItemImages(Integer itemId) {
        return getItem(itemId).getImages();
    }

    @Override
    public String updateItem(Item item) {
        itemRepository.save(item);
        return "Updating item";
    }

    @Override
    public String deleteItem(Integer itemId) {
        if (getItem(itemId) == null) {
            new ItemNotFoundException(itemId);
        }
        itemRepository.deleteById(itemId);
        return "Deleting item";
    }

    @Override
    public Item getItem(Integer itemId) {
        Optional<Item> item = itemRepository.findById(itemId);

        return mapper.map(item, Item.class);
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

}
