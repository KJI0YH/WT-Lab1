package src.task4;

import src.task4.controller.Checker;
import src.task4.controller.Communicator;
import src.task4.model.Numbers;
import src.task4.view.View;

public class Main {
    public static void main(String [] args){
        Communicator communicator = new Communicator();
        Numbers nums = communicator.getInput();
        View view = new View();
        Checker checker = new Checker();
        int[] result = checker.findPrimeIndexes(nums);
        view.showResult(result);
    }
}
