package com.company;

public class Cube extends luggage {
    public float width;

    public Cube(float width){
        this.type = "Cube";
        this.width = width;
        calculateVolume();
    }

    public void calculateVolume(){
        this.volume = (float) Math.pow(this.width,3);
    }
    public String toString(){
        return "\nLuggage type: " + this.type + "\nLuggage volume: " + this.volume;
    }
}
