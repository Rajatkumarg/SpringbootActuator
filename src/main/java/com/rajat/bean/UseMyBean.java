package com.rajat.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
public class UseMyBean {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(MyBean.class);
		container.getBean("mybean");
	}
}
