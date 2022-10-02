package src.task9.model;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> balls;

    public Basket(){
        balls = new ArrayList<Ball>();
    }

    public void addBall(Ball ball){
        balls.add(ball);
    }

    public double getBallsWeight(){
        double weight = 0;
        for (Ball ball: balls){
            weight += ball.getWeight();
        }
        return weight;
    }

    public int getBallCount(Color color){
        int count = 0;
        for (Ball ball: balls){
            if (color == ball.getColor())
                count++;
        }
        return count;
    }


}
