package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ItemSummaryView;
import com.example.demo.model.Item;
import com.example.demo.model.ItemSampleView;
import com.example.demo.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping
	public List<Item> getItems(){
		return itemService.getItems();
	}
	
	@GetMapping("/summaries")
	public List<ItemSummaryView> getItemSummaries(){
		return itemService.getItemSummaries();
	}
	
	@GetMapping("/sample")
	public List<ItemSampleView> getItemSampleView() {
		return itemService.getItemSampleView();
	}
	
	@PostMapping
	public Item save(Item item) {
		return itemService.save(item);
	}

}
