package com.ByteBrawlers.ByteBrawlers.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ByteBrawlers.ByteBrawlers.Model.Item;
import com.ByteBrawlers.ByteBrawlers.Service.ItemService;

import jakarta.annotation.PostConstruct;

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

    @GetMapping("/sizes/{sizeId}")
    public List<Item> getItemsBySizeId(@PathVariable("sizeId") Integer sizeId) {
        return itemService.gotItemsBySizeID(sizeId);
    }

    @GetMapping("/even")
    public List<Item> getAllEvenIdItems() {
        return itemService.getAllEvenIdItems();
    }

    @GetMapping("/formfactor/{formFactorId}")
    public List<Item> getItemsByFormFactorId(@PathVariable("formFactorId") Integer formFactorId) {
        return itemService.getItemsByFormFactorId(formFactorId);
    }

    @GetMapping("/pricelower20")
    public List<Item> getItemsWherePriceLower20() {
        return itemService.getAllItemsWherePriceLower20();
    }

    @GetMapping("/featuredItems")
    public List<Item> getFiveRandomItems() {
        return itemService.getFiveRandomItems();
    }

    @GetMapping("/search/{searchParameter}")
    public List<Item> searchBarFeature(@PathVariable("searchParameter") String searchParameter) {
        return itemService.getAllBySearchParameter(searchParameter);
    }

//    @GetMapping("/search/{searchParameter}")
//    public List<Item> searchBarDescription(@PathVariable("") String searchParameter){
//        return itemService.getAllByDescription(searchParameter);
//    }


}
