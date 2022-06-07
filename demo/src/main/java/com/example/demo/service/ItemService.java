package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.ItemSummaryView;
import com.example.demo.model.Item;
import com.example.demo.model.ItemSampleView;

public interface ItemService {
	
	List<Item> getItems();
	
	Item save(Item item);
	
	List<ItemSummaryView> getItemSummaries();
	
	List<ItemSampleView> getItemSampleView();

}
