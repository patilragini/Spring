/*
 * 
 */
package com.bridgelabz.BeanLazyload;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestBean {
	public static void main(String args[]) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("/com/bridgelabz/BeanLazyload/Bean.xml"));

//		uncomment to create instaance of calculation 
		 Calculation calulation = (Calculation) beanFactory.getBean("calculationBean");
		System.out.println(calulation.getTotal());
	}

}
