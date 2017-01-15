package org.ljy.shoppingcart.service.impl;

import java.util.List;

import org.ljy.domain.Goods;
import org.ljy.shoppingcart.service.IShoppingCartService;

public class ShoppingCartServiceImpl implements IShoppingCartService {

	@Override
	public void addToShoppingCart(String cartID, String goodsID, int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeGoods(String cartID, String goodsID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAll(String cartID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Goods> listAll(String cartID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double balance(String cartID) {
		// TODO Auto-generated method stub
		return 0;
	}

}
