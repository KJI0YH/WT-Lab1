package src.task2;

import src.task2.controller.Checker;
import src.task2.model.Area;
import src.task1.model.Input;
import src.task1.controller.Communicator;

public class Main {
    public static void main(String[] args){
        Communicator communicator = new Communicator();
        Input input = communicator.getInput();

        Area surface = new Area();
        Checker checker = new Checker();
        boolean result = checker.isInArea(surface, input.getX(), input.getY());
        System.out.println("Result: " + result);
    }
}
