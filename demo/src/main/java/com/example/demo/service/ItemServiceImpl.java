package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ItemSummaryView;
import com.example.demo.model.Item;
import com.example.demo.model.ItemSampleView;
import com.example.demo.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemRepository itemRepository;
	
	@Override
	public List<Item> getItems() {
		
		return itemRepository.findAll();
	}

	@Override
	public Item save(Item item) {
		return itemRepository.save(item);
	}

	@Override
	public List<ItemSummaryView> getItemSummaries() {
		return itemRepository.findAllItemSummary();
	}

	@Override
	public List<ItemSampleView> getItemSampleView() {
		return itemRepository.findSampleView();
	}

}
