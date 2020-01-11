package com.myspringboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.myspringboot.model.Employee;
import com.myspringboot.repository.EmployeeRepository;

@Controller
public class HomeController {

	@Autowired
    private EmployeeRepository employeeRepository;

	@GetMapping("/")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		
		List<Employee> ListItem = new ArrayList<Employee>();
		ListItem = employeeRepository.findAll();
		    
		model.addAttribute("Item", ListItem); // This is important
		return "index";
	}

}
