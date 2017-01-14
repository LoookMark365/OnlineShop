package org.ljy.domain;

import java.util.ArrayList;

/**
 * 支付方式
 * @author 廖俊瑶
 *
 */
public class Payment {
	private String userID;//用户ID
	private String paymentID;//支付ID
	private ArrayList<Bankcard> bankcards;//银行卡
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	public String getPaymentID() {
		return paymentID;
	}
	public void setPaymentID(String paymentID) {
		this.paymentID = paymentID;
	}
	public ArrayList<Bankcard> getBankcards() {
		return bankcards;
	}
	public void setBankcards(ArrayList<Bankcard> bankcards) {
		this.bankcards = bankcards;
	}
	
}
