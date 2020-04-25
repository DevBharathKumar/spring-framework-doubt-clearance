package org.bharath.springframeworkdoubtclearance.predestorycheck;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class StudentBean {

	Logger logger = LoggerFactory.getLogger(StudentBean.class);
	
	public StudentBean() {
		logger.info("-------- Inside the Student Bean constructor --------");
	}
	
	@PostConstruct
	public void postConstruct() {
		logger.info("-------- Inside the post constructor  --------");
	} 
	
	
	@PreDestroy
	public void preDestory() {
		logger.info("-------- Inside pre destory method --------");
	}

	//This method is not called automatically 
	public void close() {
		logger.info("-------- Inside close method  --------");
	}
}
