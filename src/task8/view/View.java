package src.task8.view;

public class View {
    public void showResult(int[] result){
        System.out.println("Indexes for inserts: ");
        for (int i: result){
            System.out.print(i + "; ");
        }
    }
}
