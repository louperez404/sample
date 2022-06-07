package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.dto.ItemSummaryView;
import com.example.demo.model.Item;
import com.example.demo.model.ItemSampleView;

public interface ItemRepository extends JpaRepository<Item, Long> {
	
	@Query(nativeQuery = true)
	List<ItemSummaryView> findAllItemSummary();
	
	@Query(value = "select id, name, price from item", nativeQuery = true)
	List<ItemSampleView> findSampleView();
}
