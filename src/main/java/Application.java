import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {

		ApplicationContext appconContext = new AnnotationConfigApplicationContext(AppConfig.class);
	//	CustomerService service = (CustomerService) new CustomerServiceImpl();

		
		CustomerService service = appconContext.getBean("customerService",CustomerService.class);
		System.out.println(service.findAll().get(0).getFirstName());

	}

}
