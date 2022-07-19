package DataDrivernTesting;

import java.io.IOException;
import com.actiTime.generics.FileLib;

public class ReadGenericMethod {

	public static void main(String[] args) throws IOException {
		String URL=FileLib.getPropertyValue("url"); 
		System.out.println(URL);
	}
}
