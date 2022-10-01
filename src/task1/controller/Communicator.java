package src.task1.controller;

import src.task1.model.Input;

import java.util.Scanner;

public class Communicator {
    public Communicator(){

    }

    public Input getInput(){
        var scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y: ");
        double y = scanner.nextDouble();
        return new Input(x, y);
    }
}
