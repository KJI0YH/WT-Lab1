package src.task8.controller;

import src.task4.model.Numbers;

import java.util.ArrayList;

public class Merger {
    public int[] merge(Numbers a, Numbers b){
        int[] arrayA = a.getNumbers();
        int[] arrayB = b.getNumbers();

        var indexes = new ArrayList<Integer>();

        int insertPos = 0;
        int currentA = 0;
        for (int i : arrayB) {
            while (currentA < arrayA.length && i > arrayA[currentA]) {
                currentA++;
                insertPos++;
            }
            indexes.add(insertPos++);
        }
        return indexes.stream().mapToInt(i -> i).toArray();
    }
}
