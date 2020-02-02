package com.myspringboot.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.myspringboot.Form.HomeForm;
import com.myspringboot.Form.HomeForm.Customer;
import com.myspringboot.repository.EmployeeRepository;

import lombok.Value;

@Controller
public class HomeController {
    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        dataBinder.setAutoGrowCollectionLimit(1000);
    }

	@GetMapping("/")
	public String greeting(@RequestParam(name="name", required=false) List<String> name, @ModelAttribute("form") @Valid HomeForm homeform) {

		Customer cust = new Customer();
		cust.setCustid(1);
		cust.setCustname("etsts");
			
		homeform.getCustomers().add(cust);
		homeform.setName("test");
		return "index";
	}
	
	@PostMapping("/test")
	public String test( @ModelAttribute("form") HomeForm homeform) {

		

		return "index";
	}

}
