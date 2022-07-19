package AnnotationPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actiTime.generics.BaseClass;

public class ProjectModule extends BaseClass{
	@Test
	public void createProject() {
		Reporter.log("createProject", true);
	}

	@Test
	public void modifyProject() {
		Reporter.log("modifyProject", true);
	}

	@Test
	public void deleteCustomer() {
		Reporter.log("deleteProject", true);
	}
}
