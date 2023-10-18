package com.ByterBrawlers.ByteBrawlers.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ByterBrawlers.ByteBrawlers.Model.Item;
import com.ByterBrawlers.ByteBrawlers.Repository.ItemRepository;

@Service
public class ItemServiceImplement implements ItemService {

	@Autowired
	ItemRepository itemRepository;

	public ItemServiceImplement(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
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
		System.out.println(itemRepository.getReferenceById(itemId));
		itemRepository.deleteById(itemId);
		return "Deleting item";
	}

	@Override
	public Item getItem(int itemId) {
		return itemRepository.findById(itemId).get();
	}

	@Override
	public List<Item> getAllItems() {
		return itemRepository.findAll();
	}

}
