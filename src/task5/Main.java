package src.task5;

import src.task5.controller.Communicator;
import src.task5.controller.Finder;

public class Main {
    public static void main(String [] args){
        Communicator communicator = new Communicator();
        int[] sequence = communicator.getInput();
        Finder finder = new Finder();
        int result = sequence.length -  finder.getLISLength(sequence);
        System.out.println("Count of numbers to throw out: " + result);
    }
}
