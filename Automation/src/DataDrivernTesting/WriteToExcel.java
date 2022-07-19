package DataDrivernTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class WriteToExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//To java representative object file of the physical file
		FileInputStream fis=new FileInputStream("./data/Exceptions.xlsx");
		//Open and create the worknbook in the read mode. 
		Workbook wb= WorkbookFactory.create(fis);
		//get the control of the sheet then rwo then cell and then type this data. 
		wb.getSheet("DDT").getRow(0).getCell(2).setCellValue("NIshu");
		//Get the physical file format of the java representative Object or open the workbook in write mode..
		FileOutputStream fos=new FileOutputStream("./data/Exceptions.xlsx");
		//Actual writing happen here and save the excel.
		wb.write(fos);
		//For writing procedure, we have to mandatorily close the workbook/sheet
		wb.close();
	}
}
