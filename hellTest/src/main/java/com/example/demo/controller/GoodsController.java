package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.GoodsDao;



@Controller
public class GoodsController {

	@Autowired
	private GoodsDao dao;
	
	public void setDao(GoodsDao dao) {
		this.dao = dao;
	}

	@RequestMapping("/listGoods.do")
	public void list(Model model) {
		model.addAttribute("list", dao.findAll());
	}
	
	@RequestMapping("/detailGoods.do")
	public void detail(int no, Model model) {
		model.addAttribute("g",dao.findByNo(no));
	}
}