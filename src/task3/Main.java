package src.task3;

import src.task3.controller.Calculator;
import src.task3.controller.Communicator;
import src.task3.model.Input;
import src.task3.view.View;

import java.awt.geom.Point2D;

public class Main {
    public static void main(String [] args){
        Communicator communicator = new Communicator();
        Input input = communicator.getInput();
        Calculator calc = new Calculator();
        Point2D.Double[] result = calc.calculate(input.getLeft(), input.getRight(), input.getStep());
        View view = new View();
        view.showResult(result);
    }
}
