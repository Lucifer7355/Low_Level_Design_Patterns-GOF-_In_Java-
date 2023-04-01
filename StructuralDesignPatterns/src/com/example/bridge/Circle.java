package com.example.bridge;

public class Circle extends ShapeCreate {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public String draw() {
        return drawAPI.drawCircle(radius,x,y);
    }
}
