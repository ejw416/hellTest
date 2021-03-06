package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.DBManager;
import com.example.demo.vo.GoodsVo;

@Repository
public class GoodsDao {
	
	public List<GoodsVo> findAll() {
		return DBManager.findAll();
	}
	
	public GoodsVo findByNo(int no) {
		return DBManager.findByNo(no);
	}
			
}
