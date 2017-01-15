package org.ljy.shoppingcart.dao;

import java.util.List;

import org.ljy.domain.Goods;

public interface IShoppingCartDao {
	/**
	 * 添加商品
	 * 
	 * @param cartID,goodsID, goodsNum
	 */
	public void addGoods(String cartID,String goodsID,int goodsNum);

	/**
	 * 删除一个商品
	 * 
	 * @param cartID,goodsID
	 */
	public void deleteGoods(String cartID,String goodsID);

	/**
	 * 更新商品信息
	 * 
	 * @param cartID,goodsID
	 */
	public void updateGoods(String cartID,String goodsID);

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
