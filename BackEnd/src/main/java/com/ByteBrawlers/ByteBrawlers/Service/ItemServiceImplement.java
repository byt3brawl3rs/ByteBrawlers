package com.ByteBrawlers.ByteBrawlers.Service;

import java.util.List;
import java.util.Optional;

import com.ByteBrawlers.ByteBrawlers.Model.Item;
import com.ByteBrawlers.ByteBrawlers.Repository.ItemRepository;
import com.ByteBrawlers.ByteBrawlers.Response.ItemResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import Exceptions.ItemNotFoundException;

@Service
public class ItemServiceImplement implements ItemService {

	@Autowired
	private ItemRepository itemRepository;

	@Autowired
	private ModelMapper mapper;
	private final RestTemplate restTemplate;

	public ItemServiceImplement(@Value("${itemservice.base.url}") String itemBaseURL, RestTemplateBuilder builder,
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
	public String updateItem(Item item) {
		itemRepository.save(item);
		return "Updating item";
	}

	@Override
	public String deleteItem(int itemId) {
		if (getItem(itemId) == null) {
			new ItemNotFoundException(itemId);
		}
		itemRepository.deleteById(itemId);
		return "Deleting item";
	}

	@Override
	public ItemResponse getItem(int itemId) {
		Optional<Item> item = itemRepository.findById(itemId);
		ItemResponse itemResponse = mapper.map(item, ItemResponse.class);

		return itemResponse;
	}

	@Override
	public List<Item> getAllItems() {
		return itemRepository.findAll();
	}

}
