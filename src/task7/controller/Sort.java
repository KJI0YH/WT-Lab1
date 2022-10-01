package src.task7.controller;

public class Sort {
    public int[] sort(int[] array){
        int i = 0;
        while (i < array.length - 1){
            if (array[i] <= array[i + 1]){
                i++;
            }
            else{
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if (i > 0){
                    i--;
                }
            }
        }
        return array;
    }
}
