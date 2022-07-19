package DataDrivernTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	public static void main(String[] args) throws IOException {
		//Get the java respective object of the physical property file. 
		FileInputStream fis=new FileInputStream("C:\\Users\\Saumtitri Behera\\OneDrive\\QSpider\\selenium\\PropertyFIle.property");
		Properties p=new Properties();// Create object of Property class
		p.load(fis); //load file
		//Get the value(Or data) by passing the Key. 
		String url=p.getProperty("url");
		String un = p.getProperty("un");
		String pwd=p.getProperty("pwd");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
	}
}
