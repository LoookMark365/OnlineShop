package org.ljy.shoppingcart.dao;

import java.util.List;

import org.ljy.domain.Goods;
import org.ljy.domain.User;

public interface IShoppingCartDao {
	/**
	 * 添加商品
	 * 
	 * @param user
	 * @param goods
	 */
	public void addGoods(User user, Goods goods);

	/**
	 * 删除一个商品
	 * 
	 * @param user
	 * @param goods
	 */
	public void deleteGoods(User user, Goods goods);

	/**
	 * 更新商品信息
	 * 
	 * @param user
	 * @param goods
	 */
	public void updateGoods(User user, Goods goods);

	/**
	 * 按商品名查询商品
	 * 
	 * @param user
	 * @param goodsName
	 * @return List<Goods>
	 */
	public List<Goods> queryGoodsByGoodsName(User user, String goodsName);

	/**
	 * 按ID查询商品
	 * 
	 * @param user
	 * @param goodsID
	 * @return Goods
	 */
	public Goods queryGoodsByGoodsID(User user, String goodsID);

	/**
	 * 列出所有商品
	 * 
	 * @param user
	 * @return List<Goods>
	 */
	public List<Goods> listAll(User user);

	List<Goods> listAllGoods(User user);
}
