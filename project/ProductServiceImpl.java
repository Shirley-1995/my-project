package com.shopping.service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shopping.dao.ProductDAO;
import com.shopping.model.Product;

@Service

public class ProductServiceImpl implements ProductService {


		private ProductDAO productDAO;

	@Autowired
		public void setProductDAO(ProductDAO productDAO) {
			this.productDAO = productDAO;
		}

		@Transactional
		public void add(Product p) {
			((ProductServiceImpl) this.productDAO).add(p);
		}

		@Transactional
		public void updateProduct(Product p) {
			this.productDAO.updateProduct(p);
		}

		@Transactional
		public List<Product> listProducts() {
			return this.productDAO.listProducts();
		}

		@Transactional
		public Product getProductById(int id) {
			return this.productDAO.getProductById(id);
		}

		@Transactional
		public void removeProduct(int id) {
			this.productDAO.removeProduct(id);
		}

		
	



	}

