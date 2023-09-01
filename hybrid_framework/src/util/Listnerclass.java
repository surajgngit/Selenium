package util;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listnerclass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test case started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test case passed");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test case failed");

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test case skipped");

	}
	
	
}
