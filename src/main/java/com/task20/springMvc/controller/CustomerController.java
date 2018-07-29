package com.task20.springMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
	@RequestMapping(value = "/addCustomer", method = RequestMethod.GET)
    public String customer() {
        return "addCustomer";
    }
	
	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
    public String customerDetails(Model model) {
        return "success";
    }
	
	@RequestMapping(value = "/delCustomer", method = RequestMethod.GET)
    public String deleteCustomer() {
        return "delCustomer";
    }
	
	@RequestMapping(value = "/delCustomer", method = RequestMethod.POST)
    public String deletedCustomer(Model model) {
        return "success";
    }
	
	@RequestMapping(value = "/updCustomer", method = RequestMethod.GET)
    public String updateCustomer() {
        return "updCustomer";
    }
	
	@RequestMapping(value = "/updCustomer", method = RequestMethod.POST)
    public String updatedCustomer(Model model) {
        return "success";
    }
	
	@RequestMapping(value = "/loadCustomer", method = RequestMethod.GET)
    public String loadCustomer() {
        return "loadCustomer";
    }
	
	@RequestMapping(value = "/loadCustomer", method = RequestMethod.POST)
    public String loadedCustomer(Model model) {
        return "success";
    }
}
