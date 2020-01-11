/**
 * クラス名：	Tax
 * 概要　　：	消費税情報
 * 作成者名：
 * 作成日　：
 * 修正者名：
 * 修正日　：
 */

package com.myspringboot.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Tax {
	 int TAXID ;
	 double RATE;
	 Date ENDDATE;
	 public Tax() {};
	 public Tax(int TAXID,double RATE,Date ENDDATE) {
		 this.TAXID = TAXID;
		 this.RATE = RATE;
		 this.ENDDATE = ENDDATE;
	 };

}
