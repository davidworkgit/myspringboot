package com.myspringboot.Form;

import java.util.ArrayList;
import java.util.List;

import com.myspringboot.Form.SearchForm.Customer;

import lombok.Data;

@Data
public class HomeForm {
	
	private String name;
	private List<Customer> customers = new ArrayList<>();
	@Data
	public static class Customer{
	   	private int custid;
		private String custname;	 
		private String kana;
		private String tel;
		private String address;
	}

}
