package com.example.demo.db;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.demo.vo.GoodsVo;

public class DBManager {
	
	public static SqlSessionFactory sqlSessionFactory;
	
	static {
		String resource = "com/example/demo/db/sqlMapConfig.xml";
		try {
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());	
		}
	}
	
	public static List<GoodsVo> findAll() {
		List<GoodsVo> list = null;
		SqlSession session = sqlSessionFactory.openSession();
		list = session.selectList("goods.selectAll");
		session.close();
		return list;
	}
	
	public static GoodsVo findByNo(int no) {
		GoodsVo g = null;
		SqlSession session = sqlSessionFactory.openSession();
		g = session.selectOne("goods.selectByNo", no);
		session.close();
		return g;
	}
	
}
