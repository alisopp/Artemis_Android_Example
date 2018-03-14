package com.uni.aisopp.artemistutorial.utils;

/**
 * Created by AIsop on 14.03.2018.
 */

public class Vector2 {


    private float x;
    private float y;

    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * initialize a Vector2 with the coordinates (0,0)
     */
    public Vector2() {
        this.x = 0;
        this.y = 0;
    }


    public void setCoordinates(float x, float y){
        setX(x);
        setY(y);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void addX(float x){
        this.x += x;
    }

    public void addY(float y){
        this.y += y;
    }


    public void add(float x, float y){
        this.x +=x;
        this.y +=y;
    }
}
