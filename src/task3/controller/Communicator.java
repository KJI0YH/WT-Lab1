package src.task3.controller;

import src.task3.model.Input;

import java.util.Scanner;

public class Communicator {

    public Input getInput(){
        var scanner = new Scanner(System.in);
        System.out.print("Enter left border: ");
        double left = scanner.nextDouble();
        System.out.print("Enter right border: ");
        double right = scanner.nextDouble();
        System.out.print("Enter the step: ");
        double step = scanner.nextDouble();
        return new Input(left, right, step);
    }
}
