package src.task1;

import src.task1.model.Input;
import src.task1.controller.Calculator;
import src.task1.controller.Communicator;

public class Main {
    public static void main(String [] args){
        Communicator communicator = new Communicator();
        Input input = communicator.getInput();
        Calculator calc = new Calculator();
        double result = calc.calculate(input.getX(), input.getY());
        System.out.println("Result: " + result);
    }
}