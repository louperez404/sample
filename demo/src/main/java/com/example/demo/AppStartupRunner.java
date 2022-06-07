package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Item;
import com.example.demo.model.ItemType;
import com.example.demo.service.ItemService;
import com.example.demo.service.ItemTypeService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class AppStartupRunner implements ApplicationRunner {
	
	@Autowired
	ItemService itemService;
	
	@Autowired
	ItemTypeService itemTypeService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		log.info("adding data..");
		

		
		ItemType type1 = new ItemType(null, "Foods");
		ItemType type2 = new ItemType(null, "Drinks");
		
		type1 = itemTypeService.save(type1);
		type2 = itemTypeService.save(type2);
		
		Item item = Item.builder()
				.id(1L)
				.name("TTGTE")
				.build();
		
		Item item1 = new Item(null, "Pritong Manok", BigDecimal.valueOf(50), type1.getId());
		Item item2 = new Item(null, "Adobong Manok", BigDecimal.valueOf(60), type1.getId());
		
		Item item3 = new Item(null, "Coke", BigDecimal.valueOf(15), type2.getId());
		
		itemService.save(item1);
		itemService.save(item2);
		itemService.save(item3);
		
		
		log.info("Done..");
	}

}
