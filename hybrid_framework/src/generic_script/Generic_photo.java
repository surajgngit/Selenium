package generic_script;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Generic_photo {
	public static void photo(WebDriver driver) throws IOException
	{
		Date d=new Date();
		String d1=d.toString();
		String d2 = d1.replaceAll(":", "-");
		String photo=("./photo");
		TakesScreenshot tss=(TakesScreenshot) driver;
		File src=tss.getScreenshotAs(OutputType.FILE);
		File dst=new File(photo+d2+".jpeg");
		FileHandler.copy(src, dst);
		
	}

}
