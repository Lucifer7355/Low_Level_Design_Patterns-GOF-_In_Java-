package com.example.bridge;

public abstract class ShapeCreate {
    protected DrawAPI drawAPI;

    protected ShapeCreate(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract String draw();
}