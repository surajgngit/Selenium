package util;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;

public class Report_log4j {
	@Test
	public void console() throws IOException
	{
		Layout layout = new PatternLayout("%d %c %m %n");
		Appender append=new FileAppender(layout, "./reports/log1.log");
		BasicConfigurator.configure(append);
		Logger log=Logger.getLogger(this.getClass().getName());
		log.error("tc error");
		log.warn("warning while tc runs");
		log.info("info");
		
		
	}
}
