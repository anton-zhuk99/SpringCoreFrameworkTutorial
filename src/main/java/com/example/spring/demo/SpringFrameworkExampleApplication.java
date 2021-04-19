package com.example.spring.demo;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

public class SpringFrameworkExampleApplication {

//	private static SpringHelloWorld helloWorld;
//
//	public static void main(String[] args) {
//		helloWorld = new SpringHelloWorld();
//		helloWorld.setMessage("Hello World");
//		String value = helloWorld.getMessage();
//		System.out.println(value);
//	}

	private static SpringHelloWorld helloWorld; // null

	static void simpleAppContextExample() {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("beans.xml");
		helloWorld = (SpringHelloWorld) context.getBean("helloWorldBean");
		String message = helloWorld.getMessage();
		System.out.println(message);
	}

	static void beanScopeExample() {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("beans.xml");
		SpringHelloWorld obj1 = (SpringHelloWorld) context.getBean("helloWorldBean");
		SpringHelloWorld obj2 = (SpringHelloWorld) context.getBean("helloWorldBean");

		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
	}

	static void initDestroyMethod() {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("beans.xml");
		InitializingBean bean = (InitializingBean) context.getBean("printMessage");
		context.registerShutdownHook();
	}

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("===========================================");
		Message message = (Message) context.getBean("messageBean");
		System.out.println("===========================================");
		System.out.println(message.getMessage());
		System.out.println("===========================================");
		context.registerShutdownHook();
	}

}
