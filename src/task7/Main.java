package src.task7;

import src.task7.controller.Communicator;
import src.task7.controller.Sort;
import src.task7.view.View;

public class Main {
    public static void main(String[] args){
        Communicator communicator = new Communicator();
        int[] array = communicator.getInput();
        Sort sort = new Sort();
        sort.sort(array);
        View view = new View();
        view.showResult(array);
    }
}
