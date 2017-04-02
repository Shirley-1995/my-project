package com.shopping.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shopping.model.Customer;
import com.shopping.model.CustomerOrder;

	@Repository
	@Transactional
	public class CustomerOrderDAOImpl implements CustomerOrderDAO{

	        @Autowired
	        private SessionFactory sessionFactory;

	        public void addCustomerOrder1(CustomerOrder customerOrder) {
	            Session session = sessionFactory.getCurrentSession();
	            session.saveOrUpdate(customerOrder);
	            session.flush();
	        }

	public void addCustomerOrder(CustomerOrder customerOrder) {
		// TODO Auto-generated method stub
		
	}

	public boolean addCustomer(Customer c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delCustomer(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updCustomer(Customer c) {
		// TODO Auto-generated method stub
		return false;
	}

	public Customer getCustomerByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
