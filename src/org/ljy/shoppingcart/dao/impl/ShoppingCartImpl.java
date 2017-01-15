package org.ljy.shoppingcart.dao.impl;

import java.util.List;

import org.ljy.domain.Goods;
import org.ljy.shoppingcart.dao.IShoppingCartDao;
import org.springframework.stereotype.Repository;
@Repository("shoppingCartImpl")
public class ShoppingCartImpl implements IShoppingCartDao {

	@Override
	public void addGoods(String cartID, String goodsID,int goodsNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteGoods(String cartID, String goodsID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateGoods(String cartID, String goodsID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Goods> queryGoodsByGoodsName(String goodsName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Goods queryGoodsByGoodsID(String goodsID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Goods> listAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
