package generic_script;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Excel_create
{	public void ddt_create(String a,int b,int c,String d) throws EncryptedDocumentException, IOException
	{
		String path="./exel/Book2.xlsx";
		FileInputStream file=new FileInputStream(path);
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet(a);
		
		Row row = sheet.createRow(b);
		Cell cell = row.createCell(c);
		cell.setCellValue(d);
		
		FileOutputStream fi=new FileOutputStream(path);
		book.write(fi);
	}

}
