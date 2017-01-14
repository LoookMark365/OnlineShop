package org.ljy.shoppingcart.service;

import java.util.List;

import org.ljy.domain.Goods;

public interface IShoppingCartService {
	/**
	 * 加入购物车
	 * 
	 * @param goos
	 */
	public void addToShoppingCart(Goods goos);

	/**
	 * 移除商品
	 * 
	 * @param goods
	 */
	public void removeGoods(Goods goods);

	/**
	 * 移除所有商品
	 * 
	 * @param goods
	 */
	public void removeAll(List<Goods> goods);

	/**
	 * 列出所有商品
	 * 
	 * @return 所有商品List<Goods>
	 */
	public List<Goods> listAll();

	/**
	 * 支付
	 * 
	 * @param goods
	 * @return 商品总价
	 */
	public double pay(List<Goods> goods);
}
