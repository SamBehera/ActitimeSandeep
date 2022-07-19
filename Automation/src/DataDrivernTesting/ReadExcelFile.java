package DataDrivernTesting;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//to get the java representative object of the physical file.
		FileInputStream fis=new FileInputStream("C:\\Users\\Saumtitri Behera\\OneDrive\\QSpider\\selenium\\Exceptions.xlsx");
		//Open or create the workbook in read mode
		Workbook wb = WorkbookFactory.create(fis);
		//get the control of the sheet, then row, then cell and get the data
		String data=wb.getSheet("DDT").getRow(0).getCell(0).getStringCellValue();
		//Print the data to the console. 
		System.out.println(data);
	}
}
