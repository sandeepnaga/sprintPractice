package org.sandeep.javabrains;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {

	
	public static void main (String [] args){
		//Triangle triangle = new Triangle();
		
		//BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("src/main/resources/spring.xml"));	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangleSandeep");
		triangle.draw();
	}
}
