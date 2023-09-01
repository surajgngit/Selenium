package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import generic_script.*;

public class Store_links_exel  extends Base_Test{
	@Test
	public void ddt() throws EncryptedDocumentException, IOException {
		String path = "./exel/Book1.xlsx";
		FileInputStream file=new FileInputStream(path);
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.createSheet("Sheet2");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for(int i=0;i<links.size();i++)
		{
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(links.get(i).getAttribute("href"));
		}
		FileOutputStream fo=new FileOutputStream(path);
		book.write(fo);
		
		
		
	}

}
