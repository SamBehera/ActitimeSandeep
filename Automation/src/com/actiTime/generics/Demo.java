package com.actiTime.generics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void testDemo() {
		System.out.println("hi"); //Prints only on the Console
		Reporter.log("Bye", true);	//Prints on the Console and report
		Reporter.log("hello", false);	//Prints only on report
		Reporter.log("Welcome");	// Prints only on report
	}
}
