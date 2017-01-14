package org.ljy.domain;

import java.util.ArrayList;

/**
 * 商店
 * @author 廖俊瑶
 *
 */
public class Shop {
	private String userID;//用户ID
	private String shopName;//商店名
	private ArrayList<Goods> goods;//商品
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public ArrayList<Goods> getGoods() {
		return goods;
	}
	public void setGoods(ArrayList<Goods> goods) {
		this.goods = goods;
	}
	

}
