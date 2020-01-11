/**
 * クラス名：	OrderDetail
 * 概要　　：	注文明細情報
 * 作成者名：
 * 作成日　：
 * 修正者名：
 * 修正日　：
 */

package com.myspringboot.model;

import com.myspringboot.Form.SearchForm.Customer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDetail {
	long no;
	Customer customer;
	Item item;
	String orderDate;
	int quantity;
	Tax tax;
	int status;

	public OrderDetail() {}
	public OrderDetail(long no, Customer customer, Item item, String orderDate,
			int quantity, Tax tax, int status) {
		this.no = no;
		this.customer = customer;
		this.item = item;
		this.orderDate = orderDate;
		this.quantity = quantity;
		this.tax = tax;
		this.status = status;
	}


}
