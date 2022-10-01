package src.task6.view;

public class View {
    public void showResult(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                String str = String.format("%4d", matrix[i][j]);
                System.out.print(str);
            }
            System.out.println();
        }
    }
}
