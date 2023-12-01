package com.ByteBrawlers.ByteBrawlers.Controller;

import java.util.List;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ByteBrawlers.ByteBrawlers.Model.Item;
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

    @PostConstruct
    private void init() {

    }

    @GetMapping
    public List<Item> getItems() {
        return itemService.getAllItems();
    }

    @GetMapping("{id}")
    public ResponseEntity<Item> getItem(@PathVariable("id") Integer id) {
        Item itemResponse = itemService.getItem(id);
        return ResponseEntity.status(HttpStatus.OK).body(itemResponse);
    }

    @PostMapping
    public void createItem(@RequestBody Item item) {
        itemService.createItem(item);
    }

    @PutMapping
    public void updateItem(@RequestBody Item item) {
        itemService.updateItem(item);
    }

    @DeleteMapping("{id}")
    public void deleteItem(@PathVariable("id") Integer id) {
        itemService.deleteItem(id);
    }

    @GetMapping("/colors/{colorId}")
    public List<Item> getItemsByColorId(@PathVariable("colorId") Integer colorId) {
        return itemService.getItemsByColorId(colorId);
    }
}
