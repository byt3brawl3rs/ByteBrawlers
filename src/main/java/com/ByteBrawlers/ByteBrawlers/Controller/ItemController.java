package com.ByteBrawlers.ByteBrawlers.Controller;

import java.util.List;

import com.ByteBrawlers.ByteBrawlers.Model.ItemImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ByteBrawlers.ByteBrawlers.Model.Item;
import com.ByteBrawlers.ByteBrawlers.DTO.ItemDTO;
import com.ByteBrawlers.ByteBrawlers.Service.ItemService;

@RestController
@RequestMapping(value = "/items")
@CrossOrigin
public class ItemController {

    @Autowired
    private ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }


    @GetMapping("{itemId}")
    public ResponseEntity<Item> getItem(@PathVariable("itemId") Integer itemId) {
        Item itemResponse = itemService.getItem(itemId);
        return ResponseEntity.status(HttpStatus.OK).body(itemResponse);
    }

    @GetMapping
    public List<Item> getItems() {
        return itemService.getAllItems();
    }

    @GetMapping("{itemId}/images")
    public List<ItemImage> getItemImages(@PathVariable("itemId") Integer itemId) {
        return itemService.getAllItemImages(itemId);
    }

    @PostMapping("{itemId}/add-image")
    public String addImage(@PathVariable("itemId") Integer itemId, @RequestBody ItemImage image) {
        itemService.addItemImage(itemId, image);
        return "Adding image to item";
    }

    @PostMapping
    public String createItem(@RequestBody Item item) {
        this.itemService.createItem(item);
        return "Saving item";
    }

    @PutMapping
    public String updateItem(@RequestBody Item item) {
        this.itemService.updateItem(item);
        return "Updating item";
    }

    @DeleteMapping("{itemId}")
    public String deleteItem(@PathVariable("itemId") Integer itemId) {
        this.itemService.deleteItem(itemId);
        return "Deleting item";
    }
}
