package com.wantdo.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import com.wantdo.dao.IPersonDAO;
import com.wantdo.domain.Person;

public class PersonDAOTest {
	
	private XmlBeanFactory factory;
	
	public PersonDAOTest() {
		super();
		// TODO Auto-generated constructor stub
		factory=BeanFactory.getFactory();
	}

	@Test
	public void testCheckLogin(){
		IPersonDAO dao=(IPersonDAO)factory.getBean("PersonDAO");
		Person person=new Person("admin","admin");
		System.out.println(dao.checkLogin(person));
	}

}
