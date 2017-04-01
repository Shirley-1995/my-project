package com.shopping.dao;

import java.util.List;

import com.shopping.model.Product;


public interface ProductDAO {

		public void updateProduct(Product p);
		public List<Product> listProducts();
		public Product getProductById(int id);
		public void removeProduct(int id);
		public void add(Product p);
	}