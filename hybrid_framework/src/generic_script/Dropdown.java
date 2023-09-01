package generic_script;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{
	public static void selectbyindex(Select s1,int i)
	{
		s1.selectByIndex(i);
		
	}
	public static void selectbyvalue(Select s1,String i)
	{
		s1.selectByValue(i);
	}
	public static void selectbyvisibletext(Select s1,String i)
	{
		s1.selectByVisibleText(i);;
		
	}
	public static void deselctbyindiex(Select s1,int i)
	{
		s1.deselectByIndex(i);	
	}
	public static void deselctbyvalue(Select s1,String i)
	{
		s1.deselectByValue(i);
		
	}
	public static void deselectbyvisibletext(Select s1,String i)
	{
		s1.deselectByVisibleText(i);
	}
	public static void deselect_all(Select s1) 
	{
		s1.deselectAll();	
	}
	public static void getoptions(Select s1) 
	{
		List<WebElement> opt = s1.getAllSelectedOptions();
		for(WebElement b: opt) 
		{
			System.out.println(b.getText());			
		}
	}
	public static void selectfiestoption(Select s1)
	{
		s1.getFirstSelectedOption();
	}

}
