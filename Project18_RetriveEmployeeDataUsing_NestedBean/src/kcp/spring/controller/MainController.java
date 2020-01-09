package kcp.spring.controller;

import kcp.spring.service.EmployeeService;

public class MainController {
    	EmployeeService service;

	public MainController(EmployeeService service) {
	    this.service = service;
	}
}
