package org.ljy.shoppingcart.dao;

import java.util.List;

import org.ljy.domain.Goods;

public interface IShoppingCartDao {
	/**
	 * 添加商品
	 * 
	 * @param goods
	 */
	public void addGoods(Goods goods);

	/**
	 * 删除一个商品
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
	 * @param goodsName
	 * @return List<Goods>
	 */
	public List<Goods> queryGoodsByGoodsName(String goodsName);

	/**
	 * 按ID查询商品
	 * 
	 * @param goodsID
	 * @return Goods
	 */
	public Goods queryGoodsByGoodsID(String goodsID);

	/**
	 * 列出所有商品
	 * 
	 * @return List<Goods>
	 */
	public List<Goods> listAll();

}
