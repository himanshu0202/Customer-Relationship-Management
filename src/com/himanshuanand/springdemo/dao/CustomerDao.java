package com.himanshuanand.springdemo.dao;

import java.util.List;

import com.himanshuanand.springdemo.entity.Customer;

public interface CustomerDao {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
}
