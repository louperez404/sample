package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ItemType;
import com.example.demo.repository.ItemTypeRepostiory;

@Service
public class ItemTypeServiceImpl implements ItemTypeService{

	@Autowired
	ItemTypeRepostiory itemTypeRepository;
	
	@Override
	public ItemType save(ItemType type) {
		return itemTypeRepository.save(type);
	}

}
