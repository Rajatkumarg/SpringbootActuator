package com.rajat.bean;

import java.beans.JavaBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Configuration
public class MyBean {
	
	@Lazy
	@Bean(name = "mybean" )
	public MyBean getMyBean() {
		System.out.println("Bean created");
		return new MyBean();
	}
	
	
}
