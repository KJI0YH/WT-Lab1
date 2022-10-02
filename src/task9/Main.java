package src.task9;

import src.task9.model.Basket;
import src.task9.model.Ball;
import src.task9.model.Color;

public class Main {
    public static void main(String[] args){
        Basket basket = new Basket();
        basket.addBall(new Ball(1, Color.RED));
        basket.addBall(new Ball(1.5, Color.GREEN));
        basket.addBall(new Ball(2, Color.BLUE));
        basket.addBall(new Ball(2.5, Color.RED));
        basket.addBall(new Ball(4, Color.GREEN));
        basket.addBall(new Ball(6, Color.BLUE));
        basket.addBall(new Ball(9, Color.BLUE));

        double weight = basket.getBallsWeight();
        int count = basket.getBallCount(Color.BLUE);

        System.out.println("Basket weight: " + weight);
        System.out.println("Amount of blue balls: " + count);
    }
}
