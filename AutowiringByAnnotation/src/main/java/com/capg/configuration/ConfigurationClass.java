package com.capg.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capg.model.Address;
import com.capg.model.Employee;

@Configuration
public class ConfigurationClass {
	@Bean
	public Address addObj() {
		Address address = new Address();
		address.setLoc("Mangalore");
		return address;
	}

	@Bean
	public Employee empObj() {
		Employee emp = new Employee();
		emp.setEmpName("Sukanya");//Only set empName Address will be injected automatically to Employee class coz of @Autowired
		return emp;
	}
}
