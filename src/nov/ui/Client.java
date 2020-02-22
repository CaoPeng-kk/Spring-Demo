package nov.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import nov.service.CustomerService;

public class Client {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		CustomerService cs = (CustomerService) ac.getBean("customerService");
		cs.saveCustomer();
		
	}

}
