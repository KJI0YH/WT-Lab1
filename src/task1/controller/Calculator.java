package src.task1.controller;

public class Calculator {
    public Calculator() {

    }

    public double calculate(double x, double y) {
        double numerator = 1 + Math.pow(Math.sin(x + y), 2);
        double denominator = 2 + Math.abs(x - 2 * x / (1 + Math.pow(x * y, 2)));
        return numerator / denominator + x;
    }
}


