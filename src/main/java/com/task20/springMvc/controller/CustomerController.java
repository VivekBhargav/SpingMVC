package com.task20.springMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.task20.springMvc.pojo.Customer;
import com.task20.springMvc.service.CustomerServ;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerServ custServ;
	
	Customer customer = new Customer("Mr.", "Vivek", "K", "B", "vivek@gmail.com", "IMCS", "ViVek", "Vivek B K",
			"nothing");
	
	@RequestMapping(value = "/addCustomer", method = RequestMethod.GET)
    public String customer() {
        return "addCustomer";
    }
	
	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
    public String customerDetails(Model model) {
		custServ.addCustomer();
        return "success";
    }
	
	@RequestMapping(value = "/delCustomer", method = RequestMethod.GET)
    public String deleteCustomer() {
        return "delCustomer";
    }
	
	@RequestMapping(value = "/delCustomer", method = RequestMethod.POST)
    public String deletedCustomer(Model model) {
		custServ.deleteCustomer();
        return "success";
    }
	
	@RequestMapping(value = "/updCustomer", method = RequestMethod.GET)
    public String updateCustomer() {
        return "updCustomer";
    }
	
	@RequestMapping(value = "/updCustomer", method = RequestMethod.POST)
    public String updatedCustomer(Model model) {
		custServ.updateCustomer();
        return "success";
    }
	
	@RequestMapping(value = "/loadCustomer", method = RequestMethod.GET)
    public String loadCustomer() {
		custServ.loadCustomer();
		return "loadCustomer";
	}
	
}
