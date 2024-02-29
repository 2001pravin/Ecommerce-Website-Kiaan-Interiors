package com.champion.services;


import com.champion.Exception.ProductException;
import com.champion.model.Cart;
import com.champion.model.User;
import com.champion.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	public String addCartItem(Long userld, AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userld);

}
