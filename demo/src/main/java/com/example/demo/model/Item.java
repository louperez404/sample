package com.example.demo.model;

import java.math.BigDecimal;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import com.example.demo.dto.ItemSummaryView;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder(toBuilder = true)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@NamedNativeQuery(
		name = "Item.findAllItemSummary", 
		query = "select i.id, it.name type, i.name, i.price "
				+ "from item i left join item_type it "
				+ "on i.item_type_id = it.id",
		resultSetMapping = "ItemSummaryView")
@SqlResultSetMapping(
        name="ItemSummaryView",
	    classes = @ConstructorResult(
	            targetClass = ItemSummaryView.class,
	            columns = {
	                @ColumnResult(name = "id", type = Long.class),
	                @ColumnResult(name = "name"),
	                @ColumnResult(name = "type"),
	                @ColumnResult(name = "price", type = BigDecimal.class)
	                }
	            )
        )
@Table(name = "item")
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private BigDecimal price;
	
	private Long itemTypeId;
	
	

}
