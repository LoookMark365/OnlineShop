package org.ljy.shoppingcart.service;

import java.util.List;

import org.ljy.domain.Goods;

public interface IShoppingCartService {
	/**
	 * 加入购物车
	 * 
	 * @param cartID,goodsID,num
	 */
	public void addToShoppingCart(String cartID, String goodsID, int num);

	/**
	 * 移除商品
	 * 
	 * @param cartID,goodsID
	 */
	public void removeGoods(String cartID, String goodsID);

	/**
	 * 移除所有商品
	 * 
	 * @param cartID
	 */
	public void removeAll(String cartID);

	/**
	 * 列出所有商品
	 * 
	 * @param cartID
	 * @return 所有商品List<Goods>
	 */
	public List<Goods> listAll(String cartID);

	/**
	 * 结算
	 * 
	 * @param cartID
	 * @return 商品总价
	 */
	public double balance(String cartID);
}
