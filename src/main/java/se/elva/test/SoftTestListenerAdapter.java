package se.elva.test;


import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class SoftTestListenerAdapter implements IInvokedMethodListener {

	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {}
	
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {}
	
}