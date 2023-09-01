package runner_script;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class For_listner {
	@Test
	public void tc1() {
		
		System.out.println("hello Banglore");
	}
	@Test
	public void tc2() {
		System.out.println("hello India");
		Assert.fail();
	}
	@Test(dependsOnMethods = "tc2")
	public void tc3() {
		System.out.println("hello Asia");
	}

}
