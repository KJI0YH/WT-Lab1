package src.task7.view;

public class View {
    public void showResult(int[] array){
        System.out.println("Sorted array: ");
        for (int i : array){
            System.out.print(i + "; ");
        }
    }
}
