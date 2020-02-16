package com.capg;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capg.configuration.ConfigurationClass;
import com.capg.model.Employee;

@SpringBootApplication
public class AutowiringByAnnotation {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		Employee e = (Employee) context.getBean("empObj");
		System.out.println(e);
	}

}
