package org.ljy.shop.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.ljy.domain.Goods;
import org.ljy.shop.dao.IShopDao;
import org.springframework.stereotype.Repository;

@Repository("shopDao")
public class ShopDaoImpl implements IShopDao {

	@Override
	public void addGoods(HashMap<String, Object> shopIDAndGoods) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteGoods(HashMap<String, Object> shopIDAndGoods) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateGoods(HashMap<String, Object> shopIDAndGoods) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Goods> queryGoodsByGoodsName(HashMap<String, Object> shopIDAndGoodsName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Goods queryGoodsByGoodsID(HashMap<String, Object> shopIDAndGoodsName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Goods> queryAll(String shopID) {
		// TODO Auto-generated method stub
		return null;
	}

}
