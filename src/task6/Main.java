package src.task6;

import src.task6.controller.Communicator;
import src.task6.controller.Matrix;
import src.task6.view.View;

public class Main {
    public static void main(String[] args){
        Communicator communicator = new Communicator();
        int[] vector = communicator.getInput();
        Matrix matrix = new Matrix();
        int[][] result = matrix.create(vector);
        View view = new View();
        view.showResult(result);
    }
}
