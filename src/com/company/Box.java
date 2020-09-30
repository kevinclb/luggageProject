package com.company;

public class Box extends luggage {
    public float boxWidth;
    public float boxHeight;
    public float boxLength;
    public Box(float width, float height, float length){
        this.type = "Box";
        this.boxWidth = width;
        this.boxHeight = height;
        this.boxLength = length;
        calculateVolume();
    }

    public void calculateVolume(){
        this.volume = this.boxWidth * this.boxHeight * this.boxLength;
    }

    public String toString(){
        return "\nLuggage type: " + this.type + "\nLuggage volume:" + this.volume;
    }
}
