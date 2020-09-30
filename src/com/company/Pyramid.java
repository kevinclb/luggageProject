package com.company;

public class Pyramid extends luggage{
    public float length;
    public float width;
    public float height;
    public Pyramid(float length, float width, float height){
        super();
        this.type = "Pyramid";
        this.length = length;
        this.width = width;
        this.height = height;
        calculateVolume();
    }

    public void calculateVolume(){
        this.volume = ((this.length * this.width * this.height) / 3);
    }

    public String toString(){
        return "Luggage type: " + this.type + "   Luggage volume:" + this.volume + " Length: " + this.length + " Height: "+ this.height + " Width: " + this.width;
    }
}
