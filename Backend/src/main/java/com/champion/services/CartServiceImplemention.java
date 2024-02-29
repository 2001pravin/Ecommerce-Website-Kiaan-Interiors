package com.champion.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.champion.Exception.ProductException;
import com.champion.model.Cart;
import com.champion.model.User;
import com.champion.repositery.CartRepository;
import com.champion.request.AddItemRequest;

@Service
public class CartServiceImplemention implements CartService {
    @Autowired
	 private CartRepository cartRepository;
    
    private CartItemService cartItemService;
    
	@Override
	public Cart createCart(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addCartItem(Long userld, AddItemRequest req) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart findUserCart(Long userld) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
