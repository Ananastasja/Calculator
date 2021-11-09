package tests;

import main.Calculator;
import org.testng.annotations.DataProvider;

public class DataProviderTest extends BaseTest{

    @DataProvider(name = "Addition with positive numbers/ Positive test")
    public Object[][] sumUpPositiveNumbers() {
        return new Object[][]{
                {calculator.sumUpNumbers(2, 4), 6},
                {calculator.sumUpNumbers(0, 8), 8},
                {calculator.sumUpNumbers(11, 15), 26},
        };
    }

    @DataProvider(name = "Addition with negative numbers/ Positive test")
    public Object[][] sumUpNegativeNumbers() {
        return new Object[][]{
                {calculator.sumUpNumbers(-8, -5), -13},
                {calculator.sumUpNumbers(-1, -6), -7},
                {calculator.sumUpNumbers(-14, -25), -39},
        };
    }

    @DataProvider(name = "Addition negative test")
    public Object[][] sumUpNegativeTest() {
        return new Object[][]{
                {calculator.sumUpNumbers(-3, -3), 0},
                {calculator.sumUpNumbers(3, -1), 4},
                {calculator.sumUpNumbers(8, -6), 14},
        };
    }

    @DataProvider(name = "Subtraction with positive numbers/ Positive test")
    public Object[][] subtractPositiveNumbers() {
        return new Object[][]{
                {calculator.subtractNumbers(5, 3), 2},
                {calculator.subtractNumbers(3, 1), 2},
                {calculator.subtractNumbers(8, 8), 0},
        };
    }

    @DataProvider(name = "Subtraction with negative numbers/ Positive test")
    public Object[][] subtractNegativeNumbers() {
        return new Object[][]{
                {calculator.subtractNumbers(-5, -3), -2},
                {calculator.subtractNumbers(-3, 1), -4},
                {calculator.subtractNumbers(-8, -5), -3},
        };
    }

    @DataProvider(name = "Subtraction negative test")
    public Object[][] subtractNegativeTest() {
        return new Object[][]{
                {calculator.subtractNumbers(-5, -3), -8},
                {calculator.subtractNumbers(-3, -1), -4},
                {calculator.subtractNumbers(-14, -8), -22},
        };
    }

    @DataProvider(name = "Division with positive numbers/ Positive test")
    public Object[][] dividePositiveNumbers() {
        return new Object[][]{
                {calculator.divideNumbers(8, 2), 4},
                {calculator.divideNumbers(12, 2), 6},
                {calculator.divideNumbers(21, 3), 7},
        };
    }

    @DataProvider(name = "Division with negative numbers/ Positive test")
    public Object[][] divideNegativeNumbers() {
        return new Object[][]{
                {calculator.divideNumbers(-30, 5), -6},
                {calculator.divideNumbers(-3, -1), 3},
                {calculator.divideNumbers(-14, -7), 2},
        };
    }

    @DataProvider(name = "Division negative test")
    public Object[][] divideNegativeTest() {
        return new Object[][]{
                {calculator.divideNumbers(-6, -3), -2},
                {calculator.divideNumbers(-3, -1), -3},
                {calculator.divideNumbers(-14, 2), 7},
        };
    }

    @DataProvider(name = "Division by zero / Negative test")
    public Object[][] divideByZero() {
        return new Object[][]{
                {calculator.divideByZero(14), 14},
        };
    }

    @DataProvider(name = "Multiplication with positive numbers/ Positive test")
    public Object[][] multiplyPositiveNumbers() {
        return new Object[][]{
                {calculator.multiplyNumbers(6, 3), 18},
                {calculator.multiplyNumbers(4, 1), 4},
                {calculator.multiplyNumbers(20, 3), 60},
        };
    }

    @DataProvider(name = "Multiplication with negative numbers/ Positive test")
    public Object[][] multiplyNegativeNumbers() {
        return new Object[][]{
                {calculator.multiplyNumbers(-6, 6), -36},
                {calculator.multiplyNumbers(-4, -5), 20},
                {calculator.multiplyNumbers(-6, 2), -12},
        };
    }

    @DataProvider(name = "Multiplication negative test")
    public Object[][] multiplyNegativeTest() {
        return new Object[][]{
                {calculator.multiplyNumbers(-7, 2), 14},
                {calculator.multiplyNumbers(-4, -6), -24},
                {calculator.multiplyNumbers(6, 0), 6},
        };
    }
}
