package com.champion.services;

import java.util.List;


import com.champion.Exception.OrderExeption;
import com.champion.model.Address;
import com.champion.model.Order;
import com.champion.model.User;

public interface OrderService  {
	
	public Order createOrder(User user , Address shipingAddress);
	public Order findOrderById(Long orderId)throws OrderExeption;
	public List<Order>usersOrderHistory(Long userId) ;
	public Order placedOrder(Long orderId)throws OrderExeption;
	public Order confirmedOrder(Long orderId)throws OrderExeption;
	public Order shippedOrder(Long orderId)throws OrderExeption;
	public Order deliveredOrder(Long orderId)throws OrderExeption;
	public Order cancledOrder(Long orderId)throws OrderExeption;
	public List<Order>getAllOrders() ;
	public Order deleteOrder(Long orderId)throws OrderExeption;


	

}
