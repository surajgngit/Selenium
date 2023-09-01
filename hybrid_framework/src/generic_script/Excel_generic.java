package generic_script;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_generic {
	public static String ddt(String a,int b,int c) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./exel/Book1.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(a);
		Row row = sheet.getRow(b);
		Cell cell = row.getCell(c);
	    String value=cell.getStringCellValue();	
	    return value;
	}

}
