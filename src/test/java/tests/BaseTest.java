package tests;

import main.Calculator;
import org.testng.annotations.*;

@Listeners(TestListener.class)

public class BaseTest {
    public Calculator calculator = new Calculator();

    @BeforeClass
    public void startTests() {
        System.out.println("Run all tests");
    }

    @BeforeMethod
    public void initTest() {
        calculator = new Calculator();
        System.out.println("Test started");
    }

    @AfterMethod
    public void endTest() {
        System.out.println("Test ended");
    }

    @AfterClass
    public void  endAllTests() {
        System.out.println("All tests done");
    }
}
