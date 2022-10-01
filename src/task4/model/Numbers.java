package src.task4.model;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    private List<Integer> numbers = new ArrayList<Integer>();

    public void addNumber(Integer num){
        numbers.add(num);
    }

    public int[] getNumbers(){
        return numbers.stream().mapToInt(i -> i).toArray();
    }
}
