package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Division extends BaseTest {

    @Test(dataProvider = "Division with positive numbers/ Positive test",
            dataProviderClass = DataProviderTest.class,
            priority = 1,
            description = "division with positive numbers",
            groups = {"Smoke", "Positive"})
    public void dividePositiveNumbers(int result, int expectedNum) {
        Assert.assertEquals(result, expectedNum);
    }

    @Test(dataProvider = "Division with negative numbers/ Positive test",
            dataProviderClass = DataProviderTest.class,
            priority = 2,
            description = "division with negative numbers",
            groups = {"Positive"})
    public void divideNegativeNumbers(int result, int expectedNum) {
        Assert.assertEquals(result, expectedNum);
    }

    @Test(dataProvider = "Division negative test",
            dataProviderClass = DataProviderTest.class,
            invocationCount = 3,
            threadPoolSize = 3,
            priority = 3,
            description = "Assert that the incorrect result is not equal to the correct one",
            groups = {"Negative"})
    public void divideNegativeTest(int result, int expectedNum) {
        Assert.assertNotEquals(result, expectedNum);
    }

    //наверное, это как-то можно сделать лучше, но получилось пока так
    @Test(expectedExceptions = IndexOutOfBoundsException.class,
            description = "Assert dividing by zero / catching the error exception",
            invocationCount = 3,
            priority = 4,
            retryAnalyzer = Retry.class)
    public void divideByZero() {
        try {
            calculator.divideByZero(5);
            Assert.fail();
        } catch (ArithmeticException e) {
            Assert.assertEquals("/ by zero", e.getMessage());
        }
        throw new IndexOutOfBoundsException();
    }
}