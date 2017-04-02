package com.shopping.dao;

import java.util.List;

import com.shopping.model.Cart;


public interface CartDAO {
Cart getCartByCartId(int cartId);
}
