package com.shopping.dao;

import java.util.List;

import com.shopping.model.Cart;
import com.shopping.model.CartItem;


public interface CartItemDAO {

	public interface CartItemDao {
	void addCart(CartItem cartItem);

	void removeCartItem(int cartItemId);
	void removeAllCartItems(Cart cart);
	}

	
}
