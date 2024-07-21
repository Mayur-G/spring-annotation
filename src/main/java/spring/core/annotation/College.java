package spring.core.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//@Component("collegeBean")
public class College {

	// @Value("Tutorial Class")
	@Value("${college.Name}")
	@Autowired(required = true)
	private String collegeName;

	@Autowired
	private Principal principal;

	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;

//	public College(Principal principal) {
//		this.principal = principal;
//	}

	public College() {

	}

	@Required
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	// @Autowired
	public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("using setPrincipal method");
	}

	// @Autowired
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
		System.out.println("using setTeacher method");
	}

	public void test() {
		teacher.teach();
		principal.principleInfo();
		System.out.println("testing collegeBean() method");
		System.out.println("class name : " + collegeName);
	}
}
