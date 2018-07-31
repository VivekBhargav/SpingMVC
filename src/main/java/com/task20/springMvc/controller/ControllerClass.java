package com.task20.springMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.task20.springMvc.pojo.Customer;
import com.task20.springMvc.service.OrdersServ;

@Controller
public class ControllerClass {
	
	@Autowired
	OrdersServ orderServ;
	
	Customer c = new Customer("Mr.", "Vivek", "K", "B", "vivek@gmail.com", "IMCS", "ViVek", "Vivek B K",
				"nothing");
	
	@RequestMapping(" ")
	public String defaultOp() {
		return "index";
	}
	
	@RequestMapping(value = "/customer", method = RequestMethod.GET)
    public String customer() {
        return "customer";
    }
	@RequestMapping(value = "/order", method = RequestMethod.GET)
	public String order() {
		return "order";
	}
}
