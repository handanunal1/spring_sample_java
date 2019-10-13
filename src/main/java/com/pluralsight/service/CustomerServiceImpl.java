package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	// = new HibernateCustomerRepositoryImpl();

	public CustomerServiceImpl() {
		
	}
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("we are using setter  injection");
		this.customerRepository = customerRepository;
	}

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("we are using constructor injection");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();

	}

}