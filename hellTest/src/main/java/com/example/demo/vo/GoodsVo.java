package com.example.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsVo {
	private int no;
	private String name;
	private int price;
	private int qty;
	private String fname;
	
	
}
