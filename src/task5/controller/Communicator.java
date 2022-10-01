package src.task5.controller;

import java.util.Random;
import java.util.Scanner;

public class Communicator {
    public int[] getInput(){
        var scanner = new Scanner(System.in);
        System.out.print("Enter the length of the sequence: ");
        int len = scanner.nextInt();

        int[] numbers = new int[len];
        Random rand = new Random();
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(0, 100);
            System.out.print(numbers[i] + "; ");
        }
        System.out.println();
        return numbers;
    }
}
