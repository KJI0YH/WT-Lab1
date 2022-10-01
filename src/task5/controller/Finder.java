package src.task5.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Finder {

    // LIS - largest increasing sequence
    public int getLISLength(int[] sequence) {
        if (sequence.length == 0)
            return 0;

        var LIS = new ArrayList<Integer>();
        int max = sequence[0];
        LIS.add(max);
        for (int i = 1; i < sequence.length; i++) {
            if (max < sequence[i]) {
                max = sequence[i];
                LIS.add(max);
            } else {
                LIS.set(findMinLargest(LIS, sequence[i]), sequence[i]);
            }
        }
        return LIS.size();
    }

    private int findMinLargest(ArrayList<Integer> list, int num) {
        int largestInd = list.size() - 1;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(largestInd) && num < list.get(i)) {
                largestInd = i;
            }
        }
        return largestInd;
    }
}
