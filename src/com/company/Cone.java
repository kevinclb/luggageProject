package com.company;


public class Cone extends luggage {
    float radius;
    float height;
    float pi = 3.14f;
    public Cone(float radius,float height){
        this.type = "Cone";
        this.radius = radius;
        this.height = height;
        calculateVolume();
    }

    public void calculateVolume(){
        this.volume = pi * (radius * radius) * (height/3);
    }
    public String toString(){
        return "\nLuggage type: " + this.type + "\nLuggage volume: " + this.volume;
    }
}

