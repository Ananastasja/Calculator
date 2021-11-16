package main;

public class Calculator {

    public int sumUpNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtractNumbers(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int divideNumbers(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int divideByZero(int firstNumber) {
        return firstNumber / 0;
    }

    public int multiplyNumbers(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}
