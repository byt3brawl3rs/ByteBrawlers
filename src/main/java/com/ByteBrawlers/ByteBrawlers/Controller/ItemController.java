package com.ByteBrawlers.ByteBrawlers.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.ByteBrawlers.ByteBrawlers.Model.Item;
import com.ByteBrawlers.ByteBrawlers.Response.ItemResponse;
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
    public ResponseEntity<ItemResponse> getItem(@PathVariable("itemId") int itemId) {
        ItemResponse itemResponse = itemService.getItem(itemId);
        return ResponseEntity.status(HttpStatus.OK).body(itemResponse);
    }

    @GetMapping
    public List<Item> getItems() {
        return itemService.getAllItems();
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
    public String deleteItem(@PathVariable("itemId") int itemId) {
        this.itemService.deleteItem(itemId);
        return "Deleting item";
    }
}
