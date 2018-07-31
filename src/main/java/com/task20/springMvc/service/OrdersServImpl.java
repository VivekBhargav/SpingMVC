package com.task20.springMvc.service;

import java.util.Date;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task20.springMvc.dao.IOrdersDAO;
import com.task20.springMvc.pojo.Orders;
import com.task20.springMvc.pojo.Orders_Products;

@Service
public class OrdersServImpl implements OrdersServ {
	static Scanner scan = new Scanner(System.in);
	
	@Autowired
	IOrdersDAO ordersDao;

	@Override
	public void createOrder() {
		Orders order = new Orders("OrderNew", new Date(), new Date(), new Date(), 1);
		Orders_Products ordPrd = new Orders_Products(2, 102, 3, 29.12);

		System.out.println(ordersDao.createOrder(order, ordPrd));
	}

	@Override
	public void deleteOrder() {
		System.out.println("Enter Order Id to Delete an order : ");
		int id = scan.nextInt();
		System.out.println(ordersDao.deleteOrder(id));
	}

	@Override
	public void updateOrder() {
		System.out.println("Enter Order id to Update : ");
		int id = scan.nextInt();
		Orders order = new Orders("OrderUpd", new Date(), new Date(), new Date(), 1);
		order.setOrder_ID(id);
		System.out.println(ordersDao.updateOrder(order));
	}

	@Override
	public void loadOrder() {
		System.out.println("Enter Order id to Load : ");
		int id = scan.nextInt();
		Orders order = (Orders) ordersDao.getOrder(id);
		System.out.println(order);
	}
}
