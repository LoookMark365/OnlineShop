package org.ljy.shop.dao;

import java.util.List;

import org.ljy.domain.Goods;

public interface IShopDao {
	/**
	 * 添加商品
	 * 
	 * @param goods
	 */
	public void addGoods(Goods goods);

	/**
	 * 删除商品
	 * 
	 * @param goods
	 */
	public void deleteGoods(Goods goods);

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
	 * @return
	 */
	public List<Goods> queryAll();
}
