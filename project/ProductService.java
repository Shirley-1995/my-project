package com.shopping.service;
import com.shopping.model.Product;
import java.util.List;


public interface ProductService { Product saveProduct (Product Product);
	
	List<Product> getAllProducts();
    Product getProductById(int id);
    void deleteProduct(int id);
    void updateProduct(Product product);
}
		
	

		

