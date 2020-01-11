package com.myspringboot.Form;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

import com.myspringboot.annotation.MyAnnotation;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class SearchForm {
	
	@Size(max=11)
	private String tel;
	@MyAnnotation(value = 3)
	private String name;
   
	private List<Customer> customers = new ArrayList<>();
	@Data
	public static class Customer{
	   	private int custId;
		private String custName;	 
		private String kana;
		private String tel;
		private String address;
	}
	   

}
