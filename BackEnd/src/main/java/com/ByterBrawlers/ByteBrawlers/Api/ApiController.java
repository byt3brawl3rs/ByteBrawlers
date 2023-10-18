package com.ByterBrawlers.ByteBrawlers.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ByterBrawlers.ByteBrawlers.Model.Item;
import com.ByterBrawlers.ByteBrawlers.Service.ItemService;

@RestController
@RequestMapping(value = "/items")
public class ApiController {

	@Autowired
	private ItemService itemService;

	public ApiController(ItemService itemService) {
		this.itemService = itemService;
	}

	@GetMapping("{itemId}")
	public Item getItem(@PathVariable("itemId") int itemId) {
		return itemService.getItem(itemId);
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
