package com.shopping.service;

import com.shopping.model.Cart;
import com.shopping.model.CustomerOrder;

public class CustomerOrderServiceImpl implements CustomerOrderService {


	public interface CartService {
	Cart getCartByCartId(int cartId);
	}

	public void addCustomerOrder(CustomerOrder customerOrder) {
		// TODO Auto-generated method stub
		
	}

	
}
