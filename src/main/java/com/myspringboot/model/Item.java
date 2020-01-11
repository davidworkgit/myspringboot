/**
 * クラス名：	Item
 * 概要　　：	商品情報
 * 作成者名：
 * 作成日　：
 * 修正者名：
 * 修正日　：
 */

package com.myspringboot.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
	String itemId;
	String itemName;
	String size;
	int price;

	public Item() {}
	public Item(String itemId, String itemName, String size, int price) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.size = size;
		this.price = price;
	}
}
