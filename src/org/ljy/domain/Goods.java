package org.ljy.domain;

import java.awt.Image;
/**
 * 商品
 * @author 廖俊瑶
 *
 */
public class Goods {
	private String goodsID;//商品ID
	private String name;//商品名
	private double price;//价格
	private double discount;//折扣
	private Image image;//图片
	public String getGoodsID() {
		return goodsID;
	}
	public void setGoodsID(String goodsID) {
		this.goodsID = goodsID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	

}
