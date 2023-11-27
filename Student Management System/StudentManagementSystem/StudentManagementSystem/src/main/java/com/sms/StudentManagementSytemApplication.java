package com.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class StudentManagementSytemApplication {
	
//	@SuppressWarnings("rawtypes")
//	@Bean
//	public FilterRegistrationBean jwtFilter()
//	{
//		final FilterRegistrationBean registrationBean=new FilterRegistrationBean();
//			registrationBean.setFilter(new JwtFilter());
//		    registrationBean.addUrlPatterns("/api/*");
//			return registrationBean;
//	
//	}
	

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSytemApplication.class, args);
		System.out.println("Welcome to Student Management system");
	}

}
