package com.actiTime.generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileLib {
	public static String getPropertyValue(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/PropertyFIle.property");
		Properties p=new Properties();
		p.load(fis);
		 String value = p.getProperty(key);
		
		return value;
	}

}
