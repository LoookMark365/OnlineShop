package org.ljy.shop.service;

import java.util.List;

import org.ljy.domain.Goods;
import org.ljy.domain.Shop;

public interface IShopService {
	/**
	 * 开店
	 * 
	 * @param shop
	 */
	public void openShop(Shop shop);

	/**
	 * 向商店添加商品
	 * 
	 * @param goods
	 */
	public void addGoods(Goods goods);

	/**
	 * 从商店移除商品
	 * 
	 * @param goods
	 */
	public void removeGoods(Goods goods);

	/**
	 * 更新商品信息
	 * 
	 * @param goods
	 */
	public void updateGoods(Goods goods);

	/**
	 * 按商品名查询商品
	 * 
	 * @param goods
	 * @return List<Goods>
	 */
	public List<Goods> queryGoodsByGoodsName(String goodsName);

	/**
	 * 按商品ID查询商品
	 * 
	 * @param goods
	 * @return Goods
	 */
	public Goods queryGoodsByGoodsID(String goodsID);

	/**
	 * 列出所有商品
	 * 
	 * @return 所有商品List<Goods>
	 */
	public List<Goods> listAll();
}
