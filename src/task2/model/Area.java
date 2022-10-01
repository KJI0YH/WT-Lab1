package src.task2.model;

import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;


public class Area {
    public List<Rectangle2D.Double> area = new ArrayList<>();

    public Area() {
        area.add(new Rectangle2D.Double(-4, 0, 8, 5));
        area.add(new Rectangle2D.Double(-6, -3, 12, 3));
    }
}
