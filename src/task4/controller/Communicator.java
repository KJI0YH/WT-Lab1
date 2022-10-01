package src.task4.controller;

import src.task4.model.Numbers;

public class Communicator {

    public Numbers getInput(){
        Numbers nums = new Numbers();
        var scanner = new java.util.Scanner(System.in);

        System.out.println("To stop entering numbers enter: exit");
        System.out.print("Enter number: ");
        while (scanner.hasNextInt()){
            nums.addNumber(scanner.nextInt());
            System.out.print("Enter number: ");
        }
        System.out.println("Stop entering");

        return nums;
    }

}
