package com.wantdo.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactory {
	
	private static XmlBeanFactory factory;
	
	static{
		factory=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
	}

	public static XmlBeanFactory getFactory() {
		return factory;
	}
	

}
