package com.shopping.controller;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shopping.model.Product;
import com.shopping.service.ProductService;


@Controller


public class ProductController {

		@Autowired
	    private ProductService productService;

	    @RequestMapping("/list")
	    public String listProduct(Map<String, Object> map) {

	        map.put("product", new Product());
	        map.put("productList", productService.listProducts());

	        return "product";
	    }

	    @RequestMapping(value = "/addproduct", method = RequestMethod.POST)
	    public String addProduct(@ModelAttribute("product") Product product, BindingResult result) {

	        ProductService.add(product);

	        return "redirect:/product/";
	    }

	    @RequestMapping("/delete/{productId}")
	    public String deleteProduct(@PathVariable("productId") Integer productId) {

	        productService.removeProduct(productId);

	        return "redirect:/product/";
	    }
	}
	
