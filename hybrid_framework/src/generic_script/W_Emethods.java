package generic_script;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class W_Emethods {
	public static String attribute(WebElement ele,String tag) 
	{
		String att =ele.getAttribute(tag);
		return att;
	}
	public static  String text(WebElement ele)
	{
		String text = ele.getText();
		return text;
	}
	public static String tagname(WebElement ele)
	{
		String tagName = ele.getTagName();
		return tagName;
	}
	public static Point location(WebElement ele)
	{
		Point loc = ele.getLocation();
		return loc;
	}
	public static String cssvalue(WebElement ele,String val) 
	{
		String cssValue= ele.getCssValue(val);
		return cssValue;
	}
	public static Dimension size(WebElement ele) 
	{
		Dimension size = ele.getSize();
		return size;
	}
	

}
