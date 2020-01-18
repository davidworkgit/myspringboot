package com.myspringboot.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myspringboot.Form.SearchForm;
import com.myspringboot.model.Employee;
import com.myspringboot.repository.CustomerRepository;
import com.myspringboot.repository.EmployeeRepository;

@Controller
public class searchController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
    private CustomerRepository customerRepository;
	@GetMapping("/search")
	public String search(@ModelAttribute("form") SearchForm searchform) {
		return "search";
	}
	
	@RequestMapping(value="/search", params={"search"})
	public String search(@ModelAttribute("form") @Valid SearchForm searchform, BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
		      return "search";
	    }
		if(searchform.getTel() != null && !searchform.getTel().isEmpty()) {
			searchform.getCustomers().add(customerRepository.findByTel(searchform.getTel()));
		}else {
			searchform.setCustomers(customerRepository.findAll());
		}
		
		
		return "search";
	}
	
	@RequestMapping(value="/search",method = RequestMethod.POST, params={"download"})
	public String download(@ModelAttribute("form") SearchForm searchform) {
		int a = 1;
	   
	    return "search";
	}

}
