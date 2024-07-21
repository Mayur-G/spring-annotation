package spring.core.annotation;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("I'm your Science Teacher");
	}

}
