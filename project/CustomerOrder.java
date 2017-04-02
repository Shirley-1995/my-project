package com.shopping.model;

import javax.persistence.*;
import java.io.Serializable;
	
	@Entity
	public class CustomerOrder<BillingAddress> implements Serializable{

	    private static final long serialVersionUID = 2983360377227484514L;

	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private int customerOrderId;

	    @OneToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	    @JoinColumn(name = "cartId")
	    private Cart cart;

	    @OneToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	    @JoinColumn(name = "customerId")
	    private Customer customer;

	    @OneToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	    @JoinColumn(name = "billingAddressId")
	    private BillingAddress billingAddress;

	    @OneToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	    @JoinColumn(name="shippingAddressId")
	    private ShippingAddress shippingAddress;

	    public int getCustomerOrderId() {
	        return customerOrderId;
	    }

	    public void setCustomerOrderId(int customerOrderId) {
	        this.customerOrderId = customerOrderId;
	    }

	    public Cart getCart() {
	        return cart;
	    }

	    public void setCart(Cart cart) {
	        this.cart = cart;
	    }

	    public Customer getCustomer() {
	        return customer;
	    }

	    public void setCustomer(Customer customer) {
	        this.customer = customer;
	    }

	    public BillingAddress getBillingAddress() {
	        return billingAddress;
	    }

	    public void setBillingAddress(BillingAddress billingAddress) {
	        this.billingAddress = billingAddress;
	    }

	    public ShippingAddress getShippingAddress() {
	        return shippingAddress;
	    }

	    public void setShippingAddress(ShippingAddress shippingAddress) {
	        this.shippingAddress = shippingAddress;
	    }
	}

	
