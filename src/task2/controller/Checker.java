package src.task2.controller;

import src.task2.model.Area;

import java.awt.geom.Rectangle2D;

public class Checker {

    public boolean isInArea(Area area, double x, double y){
        for (Rectangle2D.Double rect: area.area) {
            if (rect.x <= x && x <= rect.x+rect.width
            && rect.y <= y && y <= rect.y+rect.height)
                return true;
        }
        return false;
    }
}
