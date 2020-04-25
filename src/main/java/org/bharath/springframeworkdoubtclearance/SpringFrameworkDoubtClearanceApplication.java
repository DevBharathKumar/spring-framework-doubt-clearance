package org.bharath.springframeworkdoubtclearance;

import org.bharath.springframeworkdoubtclearance.predestorycheck.StudentBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFrameworkDoubtClearanceApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =  SpringApplication.run(SpringFrameworkDoubtClearanceApplication.class, args);
		
		applicationContext.getBean(StudentBean.class);
	}

}
