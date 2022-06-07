package com.example.demo.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.demo.model.Item;
import com.example.demo.service.ItemServiceImpl;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.Arrays;
import java.util.List;


@ExtendWith(MockitoExtension.class)
public class ItemControllerTest {
	
	@Mock
	ItemServiceImpl itemService;
	
	@InjectMocks
	ItemController itemController;
	
	MockMvc mockMvc;
	
	@BeforeEach
	public void init() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(itemController).build();
	}
	
	@Test
	public void shouldSuccessfullyGetItems() throws Exception {
		
//		List<Item> items = Arrays.asList(new Item[] {
//				
//		});
		
		this.mockMvc.perform(get("/item"))
		.andExpect(status().isOk());
	}

}
