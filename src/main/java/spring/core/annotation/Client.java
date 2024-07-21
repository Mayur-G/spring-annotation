package spring.core.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		//College college = context.getBean("collegeBean",College.class);
		//College college = context.getBean("colBean",College.class);
		College college = context.getBean("college",College.class); //default name same as class
		System.out.println(college);
		college.test();
		((AnnotationConfigApplicationContext)context).close();
	}	
}
