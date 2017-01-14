package org.ljy.shop.dao;

import java.util.ArrayList;
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
	 * @param goodsNameAndShopID
	 * @return List<Goods>
	 */
	public List<Goods> queryGoodsByGoodsName(ArrayList<String> goodsNameAndShopID);

	/**
	 * 按商品ID查询商品
	 * 
	 * @param goodsIDAndShopID
	 * @return Goods
	 */
	public Goods queryGoodsByGoodsID(ArrayList<String> goodsIDAndShopID);

	/**
	 * 列出所有商品
	 * 
	 * @param goodsID
	 * @return
	 */
	public List<Goods> queryAll(String goodsID);
}
