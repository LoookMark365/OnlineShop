package org.ljy.shop.dao;

import java.util.HashMap;
import java.util.List;

import org.ljy.domain.Goods;

public interface IShopDao {
	/**
	 * 添加商品
	 * 
	 * @param shopIDAndGoods
	 */
	public void addGoods(HashMap<String, Object> shopIDAndGoods);

	/**
	 * 删除商品
	 * 
	 * @param shopIDAndGoods
	 */
	public void deleteGoods(HashMap<String, Object> shopIDAndGoods);

	/**
	 * 更新商品信息
	 * 
	 * @param shopIDAndGoods
	 */
	public void updateGoods(HashMap<String, Object> shopIDAndGoods);

	/**
	 * 按商品名查询商品
	 * 
	 * @param shopIDAndGoodsName
	 * @return List<Goods>
	 */
	public List<Goods> queryGoodsByGoodsName(HashMap<String, Object> shopIDAndGoodsName);

	/**
	 * 按商品ID查询商品
	 * 
	 * @param shopIDAndGoodsName
	 * @return Goods
	 */
	public Goods queryGoodsByGoodsID(HashMap<String, Object> shopIDAndGoodsName);

	/**
	 * 列出所有商品
	 * 
	 * @param shopID
	 * @return List<Goods>
	 */
	public List<Goods> queryAll(String shopID);
}
