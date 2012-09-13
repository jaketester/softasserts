package se.elva.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ se.elva.test.SoftTestListener.class })
public class softAssertDemoTestWillFail extends SoftTestBase {

	@Test
	public void test1() {
		softAssertTrue(false);
		softAssertEquals("pass", "fail");
		softAssertFalse(true);
	}
	
	@Test
	public void test2() {
		softAssertTrue(false, "wait for it");
		assertEquals("pass", "fail");
		softAssertFalse(true);
	
	}
	
	@Test
	public void test3() {
		softAssertTrue(true);
		softAssertTrue(false);
		softAssertTrue(true);
	}
	
	@Test
	public void test4() {
		assertTrue(true);
		assertTrue(false);
		assertTrue(true);
	}
	
}
