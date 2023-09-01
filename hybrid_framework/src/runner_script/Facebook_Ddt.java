package runner_script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic_script.*;

public class Facebook_Ddt extends Base_Test
{
	@Test()
	public void test1() throws EncryptedDocumentException, IOException{
		String username = (Excel_generic.ddt("Sheet1", 0, 0));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		String password = (Excel_generic.ddt("Sheet1", 0, 1));
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
