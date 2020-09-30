package com.company;


public class Tub extends luggage {
    float length;
    float width;
    float depth;
    public Tub(float length,float width,float depth){
        this.type = "Tub";
        this.length = length;
        this.width = width;
        this.depth = depth;
        calculateVolume();
    }

    public void calculateVolume(){
        this.volume = length * width * depth;
    }

    public String toString(){
        return "Luggage type: " + this.type + "Luggage volume: " + this.volume;
    }
}

