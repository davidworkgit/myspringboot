package com.myspringboot.controller;

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
public class GreetingController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EmployeeRepository employeeRepository;
    
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		logger.info("Inserting -> {}", employeeRepository.insert(new Employee(10011, "Ramesh", "Fadatare", "ramesh@gmail.com")));
        logger.info("Inserting -> {}", employeeRepository.insert(new Employee(10012, "John", "Cena", "john@gmail.com")));
        logger.info("Inserting -> {}", employeeRepository.insert(new Employee(10013, "tony", "stark", "stark@gmail.com")));

        logger.info("Employee id 10011 -> {}", employeeRepository.findById(10011));

        logger.info("Update 10003 -> {}", employeeRepository.update(new Employee(10011, "ram", "Stark", "ramesh123@gmail.com")));

        employeeRepository.deleteById(10013);

        //logger.info("All users -> {}", employeeRepository.findAll());
		
		return "greeting";
	}

}
