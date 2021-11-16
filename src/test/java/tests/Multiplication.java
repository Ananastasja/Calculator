package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Multiplication extends BaseTest {

    @Test(dataProvider = "Multiplication with positive numbers/ Positive test",
            dataProviderClass = DataProviderTest.class,
            description = "multiplication with positive numbers",
            groups = {"Smoke", "Positive"})
    public void multiplyPositiveNumbers(int result, int expectedNum) {
        Assert.assertEquals(result, expectedNum);
    }

    @Test(dataProvider = "Multiplication with negative numbers/ Positive test",
            dataProviderClass = DataProviderTest.class,
            description = "multiplication with negative numbers",
            groups = {"Positive"})
    public void sumNegativeNumbers(int result, int expectedNum) {
        Assert.assertEquals(result, expectedNum);
    }

    @Test(dataProvider = "Multiplication negative test",
            dataProviderClass = DataProviderTest.class,
            invocationCount = 3,
            threadPoolSize = 3,
            description = "Assert that the incorrect result is not equal to the correct one",
            groups = {"Negative"})
    public void sumNegativeTest(int result, int expectedNum) {
        Assert.assertNotEquals(result, expectedNum);
    }
}
