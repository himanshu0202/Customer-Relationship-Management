package com.himanshuanand.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.himanshuanand.springdemo.dao.CustomerDao;
import com.himanshuanand.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	// inject CustomerDao(Facade Design Pattern)
	@Autowired
	private CustomerDao customerDao;
	
	@Transactional
	@Override
	public List<Customer> getCustomers() {
		return customerDao.getCustomers();
	}
	
	@Transactional
	@Override
	public void saveCustomer(Customer theCustomer) {
		
		customerDao.saveCustomer(theCustomer);	
	}
	
	@Transactional
	@Override
	public Customer getCustomer(int theId) {
		return customerDao.getCustomer(theId);
	}
	
	@Transactional
	@Override
	public void deleteCustomer(int theId) {
		customerDao.deleteCustomer(theId);
	}

}
