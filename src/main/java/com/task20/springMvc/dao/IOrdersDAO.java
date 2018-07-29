package com.task20.springMvc.dao;

import com.task20.springMvc.pojo.Orders;
import com.task20.springMvc.pojo.Orders_Products;

public interface IOrdersDAO {
	boolean createOrder(Orders order, Orders_Products ordPrd);
	boolean deleteOrder(int orderId);
	boolean updateOrder(Orders order);
	Orders getOrder(int orderId);
}
