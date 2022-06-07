package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ItemType;

public interface ItemTypeRepostiory extends JpaRepository<ItemType, Long>{

}
