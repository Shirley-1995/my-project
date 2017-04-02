package com.shopping.service;

import com.shopping.model.Cart;
import com.shopping.model.CartItem;

public class CartItemServiceImpl implements CartItemService {

	public interface CartItemService {
	void addCart(CartItem cartItem);
	void removeCartItem(int cartItemId);
	void removeAllCartItems(Cart cart);
	}

	public void addCart(CartItem cartItem) {
		// TODO Auto-generated method stub
		
	}

	public void removeCartItem(int cartItemId) {
		// TODO Auto-generated method stub
		
	}

	public void removeAllCartItems(Cart cart) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCartItem(CartItem cartItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CartItem getCartItem(int cartItemId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
