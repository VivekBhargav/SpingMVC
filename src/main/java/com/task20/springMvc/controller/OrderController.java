package com.task20.springMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/order")
public class OrderController {

	@RequestMapping(value = "/addOrder", method = RequestMethod.GET)
	public String addOrder() {
		return "addOrder";
	}
	
	@RequestMapping(value = "/addOrder", method = RequestMethod.POST)
	public String addedOrder() {
		return "success";
	}
	
	@RequestMapping(value = "/getOrder", method = RequestMethod.GET)
	public String getOrder() {
		return "getOrder";
	}
	
	@RequestMapping(value = "/getOrder", method = RequestMethod.POST)
	public String gotOrder() {
		return "success";
	}
}
