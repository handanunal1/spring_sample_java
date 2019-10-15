package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

//@Scope("singleton")
@Service("customerService")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	// = new HibernateCustomerRepositoryImpl();

	public CustomerServiceImpl() {

	}

	@Autowired
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
