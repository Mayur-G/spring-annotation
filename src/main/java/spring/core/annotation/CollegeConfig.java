package spring.core.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//if we use this bean , no need for any xml file
@Configuration
@ComponentScan(basePackages = "spring.core.annotation")
@PropertySource("classpath:college.properties")
public class CollegeConfig {
	
/*
	@Bean
	//@Bean("colBean")
	//@Bean(name = {"colBean" , "colAnotherBean"})
	public College collegeBean()
	{
		//return new College();
		//return new College(principalBean());
		College college = new College();
		college.setPrincipal(principalBean());
		college.setTeacher(mathTeacherBean());
		return college;
	}
	
	@Bean
	public Principal principalBean()
	{
		return new Principal();
	}
	
	@Bean
	public Teacher mathTeacherBean()
	{
		return new MathTeacher();
	}
*/
	
	
}
