package com.shopping.controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.shopping.model.Cart;
import com.shopping.model.CartItem;
import com.shopping.model.Customer;
import com.shopping.model.Product;
import com.shopping.service.CartItemService;
import com.shopping.service.CartServiceImpl;
import com.shopping.service.CustomerService;
import com.shopping.service.ProductService;


import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.shopping.model.Cart;
import com.shopping.model.Customer;
import com.shopping.service.CartService;
import com.shopping.service.CustomerService;



@Controller

public class CartController {
@Autowired
private CustomerService customerService;

@Autowired

private CartService cartService;


@RequestMapping("/cart/getCartId")
public String getCartId(Model model){
Object SecurityContextHolder;
User user=(User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();

String username=user.getUsername();

Customer customer=customerService.getCustomerByName(username);

Class<? extends Customer> cart=customer.getClass();

int cartId=cart.getId();

model.addAttribute("cartId",cartId);
return "cart";
}

@RequestMapping("/cart/getCart/{cartId}")

public @ResponseBody Cart getCart(@PathVariable int cartId){
Cart cart=cartService.getClass(cartId);
return cart;
}
}







