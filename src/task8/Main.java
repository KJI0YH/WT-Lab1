package src.task8;

import src.task4.model.Numbers;
import src.task4.controller.Communicator;
import src.task8.controller.Merger;
import src.task8.view.View;

public class Main {
    public static void main(String[] args){
        Communicator communicator = new Communicator();
        Numbers a = communicator.getInput();
        Numbers b = communicator.getInput();
        Merger merger = new Merger();
        int[] result = merger.merge(a, b);
        View view = new View();
        view.showResult(result);
    }
}
