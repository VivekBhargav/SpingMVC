package com.task20.springMvc.service;

import com.task20.springMvc.pojo.Customer;

public interface CustomerServ {
	void addCustomer();
	void deleteCustomer();
	void updateCustomer();
	void loadCustomer();
	void getCustomers();
	void getMonthlySales();
	void getReport();
	Customer getSampleCustomer();
}
