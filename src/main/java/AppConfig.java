import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

@Configuration /* Application Context is replaced by this annotation */
@ComponentScan({ "com.pluralsight" })
public class AppConfig {

	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		// return new CustomerServiceImpl();gi
		// CustomerServiceImpl service = new
		// CustomerServiceImpl(getCustomerRepository());
		CustomerServiceImpl service = new CustomerServiceImpl();
		// service.setCustomerRepository(getCustomerRepository());
		// service.setCustomerRepository(getCustomerRepository()); //// to create
		// constructor repository

		return service;
	}
	
	
	

//	@Bean(name = "customerRepository")
//	public CustomerRepository getCustomerRepository() {
//		return new HibernateCustomerRepositoryImpl();
//
//	}
}
