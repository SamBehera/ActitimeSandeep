package DataDrivernTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelMultiValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//to get the java representative object of the physical file.
		FileInputStream fis=new FileInputStream("./data/Exceptions.xlsx");
		//Open or create the workbook in read mode
		Workbook wb = WorkbookFactory.create(fis);
		int count= wb.getSheet("InvalidLogin").getLastRowNum();
		for(int i=0; i<count; i++) {
			System.out.println();
			String un=wb.getSheet("InvalidLogin").getRow(i).getCell(0).getStringCellValue();
			String pw=wb.getSheet("InvalidLogin").getRow(i).getCell(1).getStringCellValue();
			System.out.println(un + " "+ pw);
		}
	}
}				
