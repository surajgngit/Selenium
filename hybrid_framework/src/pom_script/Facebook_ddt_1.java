package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_script.Base_Test;

public class Facebook_ddt_1 extends Base_Test
{
	@FindBy(xpath="//input[@id='email']")
	private WebElement ele;
	Facebook_ddt_1()
	{	
		super();
	}
	
	
	
}
