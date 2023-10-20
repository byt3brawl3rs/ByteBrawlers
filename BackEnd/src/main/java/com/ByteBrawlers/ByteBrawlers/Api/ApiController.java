package com.ByteBrawlers.ByteBrawlers.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ByteBrawlers.ByteBrawlers.Model.Item;
import com.ByteBrawlers.ByteBrawlers.Response.ItemResponse;
import com.ByteBrawlers.ByteBrawlers.Service.ItemService;

@RestController
@RequestMapping(value = "/items")
public class ApiController {

	@Autowired
	private ItemService itemService;

	@Bean
	public RestTemplate restTemplateBean() {
		return new RestTemplate();
	}

	public ApiController(ItemService itemService) {
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
