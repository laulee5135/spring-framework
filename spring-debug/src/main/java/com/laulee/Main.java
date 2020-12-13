package com.laulee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by laulee on 2020/12/13.
 */
public class Main {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationcontext.xml");
		ApplicationContext ac1 = new ClassPathXmlApplicationContext("applicationcontext.xml",ClassPathResource.class);

		Person bean = ac.getBean(Person.class);
		Person bean2 = ac.getBean(Person.class);
		System.out.println(bean);
	}
}
