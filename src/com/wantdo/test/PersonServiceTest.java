package com.wantdo.test;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import com.wantdo.domain.Person;
import com.wantdo.service.IPersonService;

public class PersonServiceTest {
	
	private XmlBeanFactory factory;
	
	public PersonServiceTest() {
		super();
		// TODO Auto-generated constructor stub
		factory=BeanFactory.getFactory();
	}

	@Test
	public void testCheckLogin() {
		IPersonService service=(IPersonService)factory.getBean("PersonService");
		Person person=new Person("admin","admin");
		System.out.println(service.checkLogin(person));
	}

}
