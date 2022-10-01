package src.task4.view;

public class View {
    public void showResult(int[] indexes){
        if (indexes.length == 0)
            System.out.println("No prime numbers");
        else {
            System.out.println("Prime number indexes: ");
            for (int ind: indexes){
                System.out.print(ind + "; ");
            }
        }
    }
}
