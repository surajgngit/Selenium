package generic_script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Finals {
	public WebDriver driver;
	@BeforeMethod
	public void generic()
	{
		System.setProperty(key,value);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	
	//pom
	
	public Base_Test()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	

}
