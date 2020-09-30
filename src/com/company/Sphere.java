package com.company;

public class Sphere extends luggage {
    public float radius;
    public Sphere(float radius){
        this.type = "Sphere";
        this.radius = radius;
        calculateVolume(radius);
    }

    public void calculateVolume(float userRadius){
        this.volume = (float) ((4/3) * (3.14) * Math.pow(userRadius,3));
    }
    public String toString(){
        return "\nLuggage type: " + this.type + "\nLuggage volume: " + this.volume;
    }
}
