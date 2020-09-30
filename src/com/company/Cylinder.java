package com.company;

public class Cylinder extends luggage {
    float radius;
    float height;
    float pi = 3.14f;
    public Cylinder(float radius,float height){
        this.type = "Cylinder";
        this.radius = radius;
        this.height = height;
        calculateVolume();
    }

    public void calculateVolume(){
        this.volume = pi * (radius*radius) * this.height;
    }

    public String toString(){
        return "\nLuggage type: " + this.type + "\nLuggage volume: " + this.volume;
    }
}
