package se.elva.test.testng.softassert;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({SoftTestListener.class})
public class SoftTestBaseTest extends SoftTestBase {

    @Test
    public void softAssertWillPassTest() {
        softAssertTrue(true);
    }

    @Test(expectedExceptions = AssertionError.class)
    public void softAssertWillFailTest() {
        assertTrue(false);
    }

}
