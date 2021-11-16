package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Addition extends BaseTest {

    @Test(dataProvider = "Addition with positive numbers/ Positive test",
            dataProviderClass = DataProviderTest.class,
            description = "addition with positive numbers",
            groups = {"Smoke", "Positive"})
    public void sumPositiveNumbers(int result, int expectedNum) {
        Assert.assertEquals(result, expectedNum);
    }

    @Test(dataProvider = "Addition with negative numbers/ Positive test",
            dataProviderClass = DataProviderTest.class,
            description = "addition with negative numbers",
            groups = {"Positive"})
    public void sumNegativeNumbers(int result, int expectedNum) {
        Assert.assertEquals(result, expectedNum);
    }

    @Test(dataProvider = "Addition negative test",
            dataProviderClass = DataProviderTest.class,
            invocationCount = 3,
            threadPoolSize = 3,
            description = "Assert that the incorrect result is not equal to the correct one",
            groups = {"Negative"})
    public void sumNegativeTest(int result, int expectedNum) {
        Assert.assertNotEquals(result, expectedNum);
    }
}
