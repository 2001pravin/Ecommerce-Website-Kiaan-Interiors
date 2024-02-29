package com.champion.services;

import com.champion.Exception.CartItemException;
import com.champion.Exception.UserException;
import com.champion.model.Cart;
import com.champion.model.CartItem;
import com.champion.model.Product;

public interface CartItemService {

	public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userId,Long id,CartItem cartItem)throws CartItemException,UserException;
	public CartItem isCartItemExist(Cart cart, Product product, String size, Long userld);
	public void removeCartItem(Long userld, Long cartitemid) throws CartItemException, UserException;
	public CartItem findCartItemById(Long cartitemid)throws CartItemException;
	
}
