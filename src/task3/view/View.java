package src.task3.view;

import java.awt.geom.Point2D;

public class View {

    public void showResult(Point2D.Double[] result){
        for (Point2D.Double point : result) {
            String str = String.format("| X: %+7.2f | F(X): %+7.2f |", point.x, point.y);
            System.out.println(str);
        }
    }
}
