package org.ljy.shoppingcart.dao.impl;

import java.util.List;

import org.ljy.domain.Goods;
import org.ljy.domain.User;
import org.ljy.shoppingcart.dao.IShoppingCartDao;
import org.springframework.stereotype.Repository;
@Repository("shoppingCartImpl")
public class ShoppingCartImpl implements IShoppingCartDao {

	@Override
	public void addGoods(User user, Goods goods) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteGoods(User user, Goods goods) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateGoods(User user, Goods goods) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Goods> queryGoodsByGoodsName(User user, String goodsName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Goods queryGoodsByGoodsID(User user, String goodsID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Goods> listAll(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Goods> listAllGoods(User user) {
		// TODO Auto-generated method stub
		return null;
	}


}
