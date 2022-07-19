package AnnotationPackage;	

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actiTime.generics.BaseClass;

public class CustomerModule extends BaseClass{

	@Test
	public void CreateCustomer() {
		Reporter.log("Logedin", true);
		Assert.fail();
	}
}
