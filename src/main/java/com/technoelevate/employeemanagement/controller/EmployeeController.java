package com.technoelevate.employeemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.google.protobuf.Service;
import com.technoelevate.employeemanagement.entity.Employee;
import com.technoelevate.employeemanagement.service.EmployeeService;


@Controller
public class EmployeeController {
	@Autowired
	public EmployeeService service;
	@GetMapping("/register")
	public String getRegistrationForm() {
		return "registrationForm";
		
	}
	@GetMapping("/login")
	public String getLoginForm() {
		return "loginForm";
	}
	
	@PostMapping("/register")
		public String register(Employee employee,ModelMap map) {
		if(employee !=null) {
			if(service.register( employee)){
				map.addAttribute("msg","Registered successfully");
				map.addAttribute("errmsg","Something went wrong");
			}
		}
			return "registrationForm";
		}
	
	
	
	
	}
	
	


