package src.task4.controller;

import src.task4.Main;
import src.task4.model.Numbers;

import java.util.ArrayList;

public class Checker {

    public int[] findPrimeIndexes(Numbers nums){
        var list = new ArrayList<Integer>();
        var numbers = nums.getNumbers();
        for (int i = 0; i < numbers.length; i++){
            if (isPrime(numbers[i]))
                list.add(i);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    private boolean isPrime(int num){
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
