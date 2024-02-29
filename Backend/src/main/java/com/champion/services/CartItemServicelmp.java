package com.champion.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.champion.Exception.CartItemException;
import com.champion.Exception.UserException;
import com.champion.model.Cart;
import com.champion.model.CartItem;
import com.champion.model.Product;
import com.champion.repositery.CartItemRepository;
import com.champion.repositery.CartRepository;

public class CartItemServicelmp implements CartItemService {
  @Autowired
	private CartItemRepository cartItemRepository;
  @Autowired
	private UserService userService;
  @Autowired
 	private CartRepository cartRepository;
	@Override
	public CartItem createCartItem(CartItem cartItem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartItem updateCartItem(Long userId, Long id, CartItem cartItem) throws CartItemException, UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartItem isCartItemExist(Cart cart, Product product, String size, Long userld) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeCartItem(Long userld, Long cartitemid) throws CartItemException, UserException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CartItem findCartItemById(Long cartitemid) throws CartItemException {
		// TODO Auto-generated method stub
		return null;
	}

}
