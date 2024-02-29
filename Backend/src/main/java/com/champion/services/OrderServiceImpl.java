package com.champion.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.champion.Exception.OrderExeption;
import com.champion.model.Address;
import com.champion.model.Order;
import com.champion.model.User;
import com.champion.repositery.CartRepository;
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private CartRepository cartRepostory;
	@Autowired
	private CartService cartItemService;
	@Autowired
	private ProduactService produactService;

	@Override
	public Order createOrder(User user, Address shipingAddress) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order findOrderById(Long orderId) throws OrderExeption {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> usersOrderHistory(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order placedOrder(Long orderId) throws OrderExeption {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order confirmedOrder(Long orderId) throws OrderExeption {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order shippedOrder(Long orderId) throws OrderExeption {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order deliveredOrder(Long orderId) throws OrderExeption {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order cancledOrder(Long orderId) throws OrderExeption {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order deleteOrder(Long orderId) throws OrderExeption {
		// TODO Auto-generated method stub
		return null;
	}

}
