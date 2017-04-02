package com.shopping.service;

import com.shopping.model.Cart;

public interface CartService {
	Cart getCartByCartId(int cartId);

	Cart getClass(int cartId);

	Cart getCart(int cartId);
	}

	
