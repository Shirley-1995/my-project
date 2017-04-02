package com.shopping.service;

import com.shopping.model.Cart;
import com.shopping.model.CartItem;

public interface CartItemService {
	void addCart(CartItem cartItem);
	void removeCartItem(CartItem cartItem);
	void removeAllCartItems(Cart cart);
	CartItem getCartItem(int cartItemId);
	}



