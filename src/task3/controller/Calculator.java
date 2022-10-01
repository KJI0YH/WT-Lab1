package src.task3.controller;

import src.task2.Main;

import java.awt.geom.Point2D;

public class Calculator {

    public Point2D.Double[] calculate(double left, double right, double step){
        Point2D.Double[] result = new Point2D.Double[(int) ((right - left) / step) + 1];
        for (int i = 0; i < result.length; i++){
            result[i] = new Point2D.Double(left, Math.tan(left));
            left += step;
        }
        return result;
    }
}
