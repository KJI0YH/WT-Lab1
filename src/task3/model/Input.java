package src.task3.model;

public class Input {

    private final double left;
    private final double right;
    private final double step;

    public Input(double left, double right, double step){
        this.left = left;
        this.right = right;
        this.step = step;
    }

    public double getLeft(){
        return this.left;
    }

    public double getRight(){
        return this.right;
    }

    public double getStep(){
        return this.step;
    }
}

