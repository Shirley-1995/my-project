package com.shopping.service;

import com.shopping.model.Cart;
import com.shopping.model.CustomerOrder;

public interface CustomerOrderService {


	public interface CartService {
	Cart getCartByCartId(int cartId);
	}

	void addCustomerOrder(CustomerOrder customerOrder);

	
}
