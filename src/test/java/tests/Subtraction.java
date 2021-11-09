package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Subtraction extends BaseTest {

    @Test(dataProvider = "Subtraction with positive numbers/ Positive test",
            dataProviderClass = DataProviderTest.class,
            description = "subtraction with positive numbers",
            groups = {"Smoke", "Positive"})
    public void subtractPositiveNumbers(int result, int expectedNum) {
        Assert.assertEquals(result, expectedNum);
    }

    @Test(dataProvider = "Subtraction with negative numbers/ Positive test",
            dataProviderClass = DataProviderTest.class,
            description = "subtraction with negative numbers",
            groups = {"Positive"})
    public void subtractNegativeNumbers(int result, int expectedNum) {
        Assert.assertEquals(result, expectedNum);
    }

    @Test(dataProvider = "Subtraction negative test",
            dataProviderClass = DataProviderTest.class,
            invocationCount = 3,
            threadPoolSize = 3,
            description = "Assert that the incorrect result is not equal to the correct one",
            groups = {"Negative"})
    public void subtractNegativeTest(int result, int expectedNum) {
        Assert.assertNotEquals(result, expectedNum);
    }
}
