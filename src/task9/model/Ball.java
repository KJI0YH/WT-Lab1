package src.task9.model;

public class Ball {
    private final double weight;
    private final Color color;

    public Ball(double weight, Color color){
        this.weight = weight;
        this.color = color;
    }

    public double getWeight(){
        return weight;
    }

    public Color getColor(){
        return color;
    }
}
